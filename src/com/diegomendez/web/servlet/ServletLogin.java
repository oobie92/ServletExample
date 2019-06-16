package com.diegomendez.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "Servlet to handle login request", urlPatterns = { "/ServletLogin" })
public class ServletLogin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        /* Process information */
        String user = request.getParameter("user");
        String enterprise = request.getParameter("enterprise");
        PrintWriter printWriter = response.getWriter();
        if ( user != null && enterprise != null ) {
            if ( enterprise.equals("microsofty") ) {
                printWriter.println("Welcome to microsofty");
            } else {
                printWriter.println("Welcome");
            }
        } else {
            printWriter.println("Invalid user");
        }
        printWriter.close();
    }
}
