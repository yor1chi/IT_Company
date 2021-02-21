package com.company.controllers;

import com.company.entities.Employee;
import com.company.repositories.interfaces.IEmployeeRepository;

import java.util.List;

public class EmployeeController {
    private final IEmployeeRepository repository;
    public EmployeeController(IEmployeeRepository repository) {
        this.repository = repository;
    }
    public String createEmployee(String name, String lastname, String birth_date, int salary) {
        Employee employee = new Employee(name, lastname, birth_date, salary);
        boolean created = repository.createEmployee(employee);

        return (created ? "Employee was successfully created!" : "Employee creation was failed!");
    }
    public String getEmployee(int id) {
        Employee employee = repository.getEmployee(id);

        return (employee == null ? "Employee wasn't found!" : employee.toString());
    }
    public String getAllEmployees() {
        List<Employee> employees = repository.getAllEmployees();
        return employees.toString();
    }
}