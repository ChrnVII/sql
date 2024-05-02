package com.vii.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + '\n' + password);

        PrintWriter pw = resp.getWriter();
        if (username.equals("root") && password.equals("123456")) {
            System.out.println("loggin success!");
            resp.sendRedirect("system.jsp");
            return;
        } else {
            pw.write("loggin failed");
            resp.sendRedirect("login.jsp");
            return;
        }
    }
}
