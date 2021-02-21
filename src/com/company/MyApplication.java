package com.company;

import com.company.controllers.EmployeeController;
import com.company.repositories.interfaces.IEmployeeRepository;

import java.util.Scanner;

public class MyApplication {
    private final EmployeeController controller;
    private final Scanner scanner;
    public MyApplication(IEmployeeRepository employeeRepository) {
        controller = new EmployeeController(employeeRepository);
        scanner = new Scanner(System.in);
    }
    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employees");
            System.out.println("2. Get employee by id");
            System.out.println("3. Create employee");
            System.out.println("4. Calculate total salary of all employees");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter the option 0-4: ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllEmployeesMenu();
                }
                else if (option == 2) {
                    getEmployeeByIdMenu();
                }
                else if (option == 3) {
                    createEmployeeMenu();
                }
                else if (option == 4) {
                    totalCostMenu();
                }
                else {
                    break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next();
            }
            System.out.println("***********************");
        }
    }
    public void getAllEmployeesMenu() {
        String response = controller.getAllEmployees();
        System.out.println(response);
    }
    public void getEmployeeByIdMenu() {
        System.out.print("Enter the id: ");
        int id = scanner.nextInt();
        String response = controller.getEmployee(id);
        System.out.println(response);
    }

    public void createEmployeeMenu() {
        System.out.print("Enter the name: ");
        String name = scanner.next();
        System.out.print("Enter the surname: ");
        String surname = scanner.next();
        System.out.print("Enter the birth date: ");
        String birth_date = scanner.next();
        System.out.print("Enter the post: ");
        String post = scanner.next();
        System.out.print("Enter the salary: ");
        int salary = scanner.nextInt();

        String response = controller.createEmployee(name, surname, birth_date, salary, post);
        System.out.println(response);
    }
    public void totalCostMenu() {
        int response = controller.totalCost();
        System.out.println("Total salary of all employees is: " + response);
    }
}
