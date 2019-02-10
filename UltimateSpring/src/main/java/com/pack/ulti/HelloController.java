package com.pack.ulti;

import com.sattvaq.entity.Employee;
import com.sattvaq.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


@Controller
public class HelloController {

    @Autowired(required=true)
    private EmployeeService empser;
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate );
        System.out.println("inside hello");
        return "hello";
    }
    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String newfaculity(HttpSession session, HttpServletRequest request, Model map
    )throws IOException {
        System.out.println("enter into controller");
        // ApplicationContext applicationContext =
        //  new AnnotationConfigApplicationContext(MainAppConfiguration.class);
        // EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        Employee employee = new Employee();

        employee.setId(Integer.parseInt(request.getParameter("id")));
        employee.setName(request.getParameter("name"));
        employee.setSalary(Float.parseFloat(request.getParameter("salary")));
        employee= empser.createEmployee(employee);
        System.out.println(employee);
        map.addAttribute("msg","employee inserted successfully");
        return "hello";

    }
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getemp(HttpSession session,HttpServletRequest request,Model map
    )throws IOException{

        List<Employee> emp=empser.getAllEmployees();
        map.addAttribute("empl",emp);



        return "hello";


    }
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteemp(HttpSession session,HttpServletRequest request,Model map
    )throws IOException{
        int id=Integer.parseInt(	request.getParameter("id"));
        empser.deleteEmployee(id);

        map.addAttribute("msg","employee deleted successfully");
        return "hello";

    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String editemp(HttpSession session,HttpServletRequest request,Model map
    )throws IOException{

        int id=Integer.parseInt(	request.getParameter("id"));
        Employee emp=empser.getEmployee(id);
        map.addAttribute("empl",emp);



        return "edit";

    }
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(HttpSession session,HttpServletRequest request,Model map
    )throws IOException{
        System.out.println("enter into controller");
        // ApplicationContext applicationContext =
        //  new AnnotationConfigApplicationContext(MainAppConfiguration.class);
        // EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        Employee employee = new Employee();

        employee.setId(Integer.parseInt(request.getParameter("id")));
        employee.setName(request.getParameter("name"));
        employee.setSalary(Float.parseFloat(request.getParameter("salary")));
        employee= empser.updateEmployee(employee);
        System.out.println(employee);
        map.addAttribute("msg","employee updated successfully");
        return "hello";

    }
}
