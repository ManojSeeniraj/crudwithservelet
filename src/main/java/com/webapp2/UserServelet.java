package com.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.*;

/**
 * UserServelet
 */
@WebServlet("/UserServelet")
public class UserServelet extends HttpServlet {


  ArrayList<User2> UsersList = new ArrayList<User2>();

  
 
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    String action = req.getParameter("action");
    System.out.println("!!!!_____!!!!"+action);

    UsersList.add(new User2("smanoj@gmail.com", "mano"));
    UsersList.add(new User2("smanojjack@gmail.com", "daya"));
    UsersList.add(new User2("dayanand@123.com", "mass"));
    UsersList.add(new User2("dayamano@gmail.com", "dayamano"));

    System.out.println("((((((((((())))))))))))))"+action);

    try {
      switch (action) {
     
        
        case "insertUser":
        insertUser(req, resp);
        break;

        case "alredyexists":
        checkUserValidation(req, resp);
        break;

      default:
        // checkUserValidation(req, resp);
        break;
      }

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Exception Occured");
    }

  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }

  private void checkUserValidation(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException,  IOException {

    System.out.println("Validation is called: :)");

    

    String email = req.getParameter("email");

    System.out.println(email);

    for (User2 user : UsersList) {

      if (user.getEmail().equals(email)) {

        System.out.println("You are a valid user");

        ServletContext context = getServletContext(); 
        context.setAttribute("email", email);

        String value = (String) context.getAttribute("email");

        System.out.println(value);

        req.setAttribute("message", value);
        RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
        dispatcher.forward(req, resp);

        break;

      }

      else if (user.getEmail() != email) {
        PrintWriter out = resp.getWriter();

        System.out.println("invalid");

        out.println("<script type=\"text/javascript\">");
        out.println("alert('You are an invalid user');");
        out.println("location='registration.jsp';");
        out.println("</script>");

      }

    }

  }

  private void insertUser(HttpServletRequest req, HttpServletResponse resp)
  throws ServletException,  IOException {

    



    System.out.println("insertUser is called");


    String email=req.getParameter("registeremail");
    String password=req.getParameter("registerPass");


    UsersList.add(new User2(email, password));

    PrintWriter out = resp.getWriter();

    

    out.println("<script type=\"text/javascript\">");
    out.println("alert('Successfully Registered!!!Plz LogIn to Continue');");
    out.println("location='index.jsp';");
    out.println("</script>");

    

  
  
  }

}
