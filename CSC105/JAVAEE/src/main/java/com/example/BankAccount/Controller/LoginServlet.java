package com.example.BankAccount.Controller;

import com.example.BankAccount.Model.Login;
import com.example.BankAccount.Model.LoginOperation;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()){
            response.setContentType("text/html;charset=UTF-8");
            LoginOperation loginOperation = new LoginOperation();
            HttpSession session;
            String memberId = loginOperation.checkLogin(request.getParameter("username"),request.getParameter("password"));
            if (memberId.equals("Login invalidate")){
                getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
            } else {
                session = request.getSession();
                session.setAttribute("memberId",memberId);
                request.getRequestDispatcher("/DashboardServlet").forward(request,response);
            }
        }
    }
}
