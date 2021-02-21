package com.company.repositories;
import com.company.data.interfaces.IDB;
import com.company.entities.Employee;
import com.company.repositories.interfaces.IEmployeeRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final IDB db;
    public EmployeeRepository(IDB db) {
        this.db = db;
    }
    @Override
    public boolean createEmployee(Employee employee) {
        try {
            Connection con = db.getConnection();
            String sql = "INSERT INTO employee(fname, lname, birth_date, salary) VALUES(?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, employee.getFirstname());
            st.setString(2, employee.getLastname());
            st.setString(3, employee.getBirth_date());
            st.setInt(4, employee.getSalary());
            boolean executed = st.execute();
            con.close();
            return executed;
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public Employee getEmployee(int id) {
        try {
            Connection con = db.getConnection();
            String sql = "Select * from employee where employee_id = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Employee employee = new Employee(rs.getInt("employee_id"),
                rs.getString("fname"),
                rs.getString("lname"),
                rs.getString("birth_date"),
                rs.getInt("salary"));
                con.close();
                return employee;
            }
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        try {
            Connection con = db.getConnection();
            String sql = "select* from employee";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Employee> employees = new ArrayList<>();
            while (rs.next()) {
                Employee employee = new Employee(rs.getInt("employee_id"),
                rs.getString("fname"),
                rs.getString("lname"),
                rs.getString("birth_date"),
                rs.getInt("salary"));
                employees.add(employee);
                con.close();
            }
            return employees;
        }
        catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}