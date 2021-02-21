package com.company.entities;

public class Employee {
    private String firstname, lastname, birth_date;
    private int id, salary;

    public Employee(int id, String name, String lastname, String birth_date, int salary) {
        setId(id);
        setBirth_date(birth_date);
        setFirstname(name);
        setLastname(lastname);
        setSalary(salary);
    }

    public Employee(String name, String lastname, String birth_date, int salary) {
        setBirth_date(birth_date);
        setFirstname(name);
        setLastname(lastname);
        setSalary(salary);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", id=" + id +
                "First name='" + firstname + '\'' +
                ", Last name='" + lastname + '\'' +
                ", Birth date='" + birth_date + '\'' +
                ", salary=" + salary +
                '}';
    }
}
