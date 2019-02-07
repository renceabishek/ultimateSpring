package com.pack.ulti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String display(ModelMap m){
        System.out.println("heii");
        m.addAttribute("Message","Hi im Abishek");
        return "hello";
    }
}
