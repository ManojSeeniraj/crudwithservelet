package com.webapp2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * gmailLoginServelet
 */
@WebServlet("/gmailLoginServelet")
public class gmailLoginServelet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        

           RequestDispatcher dispatcher=req.getRequestDispatcher("/email/emailApp.jsp");
           dispatcher.forward(req, resp);

    }

    
}