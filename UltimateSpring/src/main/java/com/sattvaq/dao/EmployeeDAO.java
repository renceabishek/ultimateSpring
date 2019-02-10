package com.sattvaq.dao;

import com.sattvaq.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public Employee createEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(int id);
    public Employee getEmployee(int id);
    public Employee updateEmployee(Employee employee);

}
