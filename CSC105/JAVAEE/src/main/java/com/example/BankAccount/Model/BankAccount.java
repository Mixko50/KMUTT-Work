package com.example.BankAccount.Model;

import java.sql.ResultSet;

public class BankAccount {
    String accountNumber;
    String accountName;
    String address;
    String district;
    String province;
    String phoneNumber;
    String amount;

    public BankAccount(ResultSet rs)throws Exception{
        this.accountNumber = rs.getString("accountnumber");
        this.accountName = rs.getString("accountName");
        this.amount = rs.getString("amount");
    }

    public BankAccount(String accountNumber, String accountName, String amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
