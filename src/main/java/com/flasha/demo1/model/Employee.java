package com.flasha.demo1.model;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private Double salary;

    public Employee() {
    }

    public Employee(Long id, String name, String department, Double salary) {
        this.id = id;
        this.setName(name); // Use setName() to ensure validation
        this.department = department;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Validate that the name does not contain any symbols
        if (!name.matches("[a-zA-Z\\s]+")) { // Allow only letters and spaces
            throw new IllegalArgumentException("Name must not contain symbols or special characters!");
        }
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
