package com.webapp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * UserDetailController
 */

@WebServlet("/UserDetailController")
public class UserDetailController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ArrayList<UserDetails> userDetails = new ArrayList<UserDetails>();
    private Gson gson = new Gson();
    ArrayList<Inbox> inbox = new ArrayList<Inbox>();
    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getParameter("action");
        System.out.println("!!!!_____!!!!" + action);

        try {
            switch (action) {

            case "inboxmail":
                inboxMail(req, resp);
                break;

            case "contactUser":
                contactUser(req, resp);
                break;

            default:
                listUser(req, resp);
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

    private void listUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        String value = (String) context.getAttribute("email");

        userDetails.add(new UserDetails(value, inbox, contacts));

        System.out.println(userDetails);
        
        String ShowAllString = this.gson.toJson(userDetails);
        System.out.println("((((((------------)))))))))))" + ShowAllString);

        req.setAttribute("ShowAllString", ShowAllString);
        RequestDispatcher dispatcher = req.getRequestDispatcher("myDetailsTable.jsp");
        dispatcher.forward(req, resp);





        List<UserDetails> userinbox = userDetails.stream().filter(x -> value == x.getEmailid())
                .collect(Collectors.toList());
        System.out.println("********" + userinbox);
    }

    private void contactUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Adding Contact is Called");
        String emailContact = req.getParameter("emailidhome");
        String Phone = req.getParameter("phonehome");

        contacts.add(new Contacts(emailContact, Phone));

        System.out.println(contacts);

        String contactString = this.gson.toJson(contacts);
        System.out.println("(((((()))))))))))" + contactString);

        req.setAttribute("contactString", contactString);
        RequestDispatcher dispatcher = req.getRequestDispatcher("myDetailsTable.jsp");
        dispatcher.forward(req, resp);


    }

    private void inboxMail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Adding Email is Called");
        String email = req.getParameter("emailidhome");
        String date = req.getParameter("datehome");
        String from = req.getParameter("fromhome");
        String to = req.getParameter("tohome");
        String subject = req.getParameter("subjecthome");
        String message = req.getParameter("messagehome");

        inbox.add(new Inbox(email, date, from, to, subject, message));

        String inboxString = this.gson.toJson(inbox);
        System.out.println("(((((()))))))))))" + inboxString);

        req.setAttribute("inboxString", inboxString);
        RequestDispatcher dispatcher = req.getRequestDispatcher("myDetailsTable.jsp");
        dispatcher.forward(req, resp);

    }

}
