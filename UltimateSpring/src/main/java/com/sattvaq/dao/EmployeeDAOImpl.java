package com.sattvaq.dao;

import com.sattvaq.entity.Employee;
import com.sattvaq.util.Mycassandratemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private Mycassandratemplate myCassandraTemplate;

    @Override
    public Employee createEmployee(Employee employee) {
        return myCassandraTemplate.create(employee, Employee.class);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return myCassandraTemplate.findAll(Employee.class);
    }

    @Override
    public void deleteEmployee(int id) {
        myCassandraTemplate.deleteById(id, Employee.class);
    }

    @Override
    public Employee getEmployee(int id) {
        return myCassandraTemplate.findById(id, Employee.class);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return myCassandraTemplate.update(employee, Employee.class);
    }
}
