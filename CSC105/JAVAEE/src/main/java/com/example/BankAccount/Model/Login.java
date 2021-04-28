package com.example.BankAccount.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
    String username;
    String password;
    String memberId;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet rs;

    public Login(String username, String password, String memberId) {
        this.username = username;
        this.password = password;
        this.memberId = memberId;
    }

    public Login (ResultSet resultSet) throws Exception{
        username = resultSet.getString("userid");
        password = resultSet.getString("password");
        memberId = resultSet.getString("memberid");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
