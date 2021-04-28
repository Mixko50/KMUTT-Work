package com.example.BankAccount.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String dbURL = "jdbc:mysql://csproject.sit.kmutt.ac.th:3306/db63130500233";

    public static Connection getMySQLConnection() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbURL,"63130500233","abcd1234");
            return connection;
        } catch (Exception w){
            w.printStackTrace();
        }
        return null;
    }
}
