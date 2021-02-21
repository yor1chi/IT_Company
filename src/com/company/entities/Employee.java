package com.company.entities;

public class Employee {
    private String firstname, lastname, birth_date, post;
    private int id, salary;

    public Employee(int employee_id, String fname, String lname, String birth_date, String post, int salary) {
        setBirth_date(birth_date);
        setFirstname(fname);
        setLastname(lname);
        setSalary(salary);
        setPost(post);
    }

    public Employee(String name, String lastname, String birth_date, int salary, String post) {
        setBirth_date(birth_date);
        setFirstname(name);
        setLastname(lastname);
        setSalary(salary);
        setPost(post);

    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
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
                "Id= " + id +
                ", First name='" + firstname + '\'' +
                ", Last name='" + lastname + '\'' +
                ", Birth date='" + birth_date + '\'' +
                ", salary=" + salary +
                ", post=" + post +
                '}';
    }
}