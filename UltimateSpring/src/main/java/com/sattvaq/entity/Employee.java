package com.sattvaq.entity;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value="employee")
public class Employee {

    @PrimaryKey(value = "id")
    private int id;
    @Column(value = "name")
    private String name;
    @Column(value = "salary")
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
