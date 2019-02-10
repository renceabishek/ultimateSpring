package com.sattvaq.service;

import com.sattvaq.dao.EmployeeDAO;
import com.sattvaq.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl() {
        super();
    }

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {
        return employeeDAO.createEmployee(employee) ;
    }



    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }
}
