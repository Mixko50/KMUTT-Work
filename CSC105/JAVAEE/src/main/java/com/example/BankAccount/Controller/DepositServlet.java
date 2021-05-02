package com.example.BankAccount.Controller;

import com.example.BankAccount.Model.BankAccount;
import com.example.BankAccount.Model.BankAccountOperation;
import com.example.BankAccount.Model.DepositOperation;
import com.example.BankAccount.Model.LoginOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DepositServlet", value = "/DepositServlet")
public class DepositServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String memberId = session.getAttribute("memberId").toString();
        System.out.println(memberId);
        DepositOperation deposit = new DepositOperation();
        System.out.println(request.getParameter("number"));
        double amount = deposit.addMoney(Integer.parseInt(memberId),Integer.parseInt(request.getParameter("number")));
        request.setAttribute("amount",amount);
        BankAccountOperation bankAccountOperation = new BankAccountOperation();
        String[] account = bankAccountOperation.checkAmount(memberId);
        BankAccount bankAccount = new BankAccount(account[0],account[1],account[2]);
        request.setAttribute("account",bankAccount);
        getServletContext().getRequestDispatcher("/Dashboard.jsp").forward(request,response);
    }
}
