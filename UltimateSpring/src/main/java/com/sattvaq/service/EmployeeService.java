package com.sattvaq.service;

import com.sattvaq.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(int id);
    public Employee getEmployee(int id);
    public Employee updateEmployee(Employee employee);
}
