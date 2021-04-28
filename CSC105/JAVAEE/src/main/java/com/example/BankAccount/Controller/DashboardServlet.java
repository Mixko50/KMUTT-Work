package com.example.BankAccount.Controller;

import com.example.BankAccount.Model.BankAccount;
import com.example.BankAccount.Model.BankAccountOperation;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DashboardServlet", value = "/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String memberId = session.getAttribute("memberId").toString();
        BankAccountOperation bankAccountOperation = new BankAccountOperation();
        String[] account = bankAccountOperation.checkAmount(memberId);
        BankAccount bankAccount = new BankAccount(account[0],account[1],account[2]);
        request.setAttribute("account",bankAccount);
        getServletContext().getRequestDispatcher("/Dashboard.jsp").forward(request,response);
    }
}
