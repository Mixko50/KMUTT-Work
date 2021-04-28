package com.example.BankAccount.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BankAccountOperation {
    Connection connection;
    ResultSet rs;
    PreparedStatement preparedStatement;
    BankAccount bankAccount;
    String[] account = new String[3];
    public String[] checkAmount(String memberId){
        try {
            connection = DBConnection.getMySQLConnection();
            preparedStatement = connection.prepareStatement("SELECT * FROM bank_account WHERE memberid = ?");
            preparedStatement.setInt(1,Integer.parseInt(memberId));
            rs = preparedStatement.executeQuery();
            if (rs.next()){
                bankAccount = new BankAccount(rs);
            }
            account[0] = rs.getString("accountNumber");
            account[1] = rs.getString("accountName");
            account[2] = rs.getString("amount");
            return account;
        } catch (Exception m){
            m.printStackTrace();
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                connection.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
