package com.example.BankAccount.Model;

import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DepositOperation {
    public int addMoney(int memberId, int money){
        try {
            Connection connection = DBConnection.getMySQLConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT amount FROM bank_account WHERE memberid = ?");
            preparedStatement.setInt(1,memberId);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            System.out.println(rs.getDouble("amount"));
            double amount = rs.getDouble("amount");
            double total = amount + money;
            preparedStatement = connection.prepareStatement("UPDATE bank_account SET amount = ? WHERE memberid = ?");
            preparedStatement.setDouble(1,total);
            preparedStatement.setInt(2,memberId);
            preparedStatement.execute();
            System.out.println(total);
            return money;
        } catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
