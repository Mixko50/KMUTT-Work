package com.example.BankAccount.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginOperation {
    Login login;
    public String checkLogin(String username, String password){
        try {
            Connection connection = DBConnection.getMySQLConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM bank_memberinfo WHERE userid LIKE ?");
            preparedStatement.setString(1,username);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()){
                login = new Login(rs);
            }
            return login.getMemberId();
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Login invalidate";
    }
}
