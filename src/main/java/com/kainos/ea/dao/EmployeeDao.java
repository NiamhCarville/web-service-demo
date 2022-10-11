package com.kainos.ea.dao;


import com.kainos.ea.model.Employee;
import com.kainos.ea.resources.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.List;

public class EmployeeDao {

    public Employee SelectEmployeeByID(int empID, Connection c) throws SQLException {

        //SELECTS EMPLOYEE ID FROM DB
        //notes 6.2
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT EmployeeID AS `number`"+",Forename AS 'forename'"+",Surname AS 'surname'"+"FROM Employee"+"WHERE (EmployeeID =" + empID+")");

        Employee dbEmp = null;
        while (rs.next()) {
            dbEmp = new Employee(rs.getShort("number"), rs.getString("forename"), rs.getString("surname"));
        }
        System.out.println(dbEmp);
        return dbEmp;
    }
//        String insertOrderQuery = "INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?,?);";
//
//        PreparedStatement preparedStmt = c.prepareStatement(insertOrderQuery);
//        preparedStmt.setInt(1, employee.getEmployeeID());
//        preparedStmt.setString(2, employee.getForename());
//        preparedStmt.setString(3, employee.getSurname());
//        preparedStmt.setInt(4, employee.getSalary());
//        preparedStmt.setInt(5, employee.getBankAccountNumber());
//        preparedStmt.setString(6, employee.getSortCode());
//        preparedStmt.setString(7, employee.getNIN());
//        preparedStmt.setString(8, employee.getEmployeeTelNo());
//        preparedStmt.setString(9, employee.getEmployeeEmail());
//
//        preparedStmt.execute();


    }

