package vii;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws UnsupportedEncodingException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("name：" + name);
        System.out.println("password：" + password);
    }

}