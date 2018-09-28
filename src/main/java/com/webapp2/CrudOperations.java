package com.webapp2;

import java.awt.Desktop.Action;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.webapp2.UserProfileGetter;

import org.omg.CORBA.Request;

@WebServlet("/CrudOperations")
public class CrudOperations extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public CrudOperations() {
    }

    ArrayList<UserProfileGetter> userProfile = new ArrayList<UserProfileGetter>();
    public String mode = "";

    // MysqlConnect mysqlConnect;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        try {
            switch (action) {
            case "saveorupdatefunc":
                saveorupdatefunc(req, resp);
                break;
            case "delete":
                deletefunc(req, resp);
                break;
            case "edit":
                editfunc(req, resp);
                break;
            case "validate":
                loginValidation(req, resp);
                break;
            case "registerAdmin":
                registration(req, resp);
                break;
            default:
                listfunc(req, resp);
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

 
    // return rowInserted;

    private void registration(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String NameAdmin = req.getParameter("nameAdmin");
        String PasswordAdmin = req.getParameter("passwordAdmin");
        

        System.out.println(NameAdmin + PasswordAdmin);

        try {
            String sql = "INSERT INTO login_form(user_name,	password) VALUES('"
                    + NameAdmin + "','" + PasswordAdmin + "')";
            int resultSet = MysqlConnection.getDbCon().insert(sql);
            System.out.println(resultSet);
        } catch (Exception e) {
            // TODO: handle exception
        }
        PrintWriter out=resp.getWriter();
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Success Login to continue');");
        out.println("location='adminLogin.jsp';");
        out.println("</script>");

       
    }





    

    private void loginValidation(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        System.out.println("Validation is called");

        String username = req.getParameter("username");
        System.out.println(username);
        String password = req.getParameter("password");
        System.err.println(password);

        String sql = "SELECT user_name,password FROM login_form WHERE  user_name=? AND password=?";
        Connection connect = (Connection) DriverManager
                .getConnection("jdbc:mysql://localhost:3306/food_store?" + "user=root&password=");
        PreparedStatement statement = (PreparedStatement) connect.prepareStatement(sql);
        System.out.println("44444444445555555" + statement);
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();
        System.out.println("@@@@@@@@" + resultSet);

        while (resultSet.next()) {
            PrintWriter out = resp.getWriter();

            out.println("<script type=\"text/javascript\">");
            out.println("alert('Success You are an Valid user');");
            out.println("location='./databaseServelet';");
            out.println("</script>");

        }
        PrintWriter out = resp.getWriter();
        out.println("<script type=\"text/javascript\">");
        out.println("alert('Not Registered');");
        out.println("location='adminRegistration.jsp';");
        out.println("</script>");

    }

    private void saveorupdatefunc(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, SQLException {
        if (mode != "update") {
            String Name = req.getParameter("Name");
            String Age = req.getParameter("age");
            String Address = req.getParameter("address");
            String Moblile_number = req.getParameter("mobile_number");
            String Email_address = req.getParameter("email_address");
            String comment = req.getParameter("comment");

            String sql = "INSERT INTO user_profile(Name,Age,Address,Mobile_number,mail_address,Comments) VALUES('"
                    + Name + "','" + Age + "','" + Address + "','" + Moblile_number + "','" + Email_address + "','"
                    + comment + "')";
            int resultSet = MysqlConnection.getDbCon().insert(sql);
            System.out.println(resultSet);

        } else {
            System.out.println("update called");
            String Name = req.getParameter("Name");
            String Age = req.getParameter("age");
            String Address = req.getParameter("address");
            String Moblile_number = req.getParameter("mobile_number");
            String Email_address = req.getParameter("email_address");
            String comment = req.getParameter("comment");
            String sql = "UPDATE user_profile SET Age=" + "'" + Age + "',Address='" + Address + "',Mobile_number='"
                    + Moblile_number + "',mail_address='" + Email_address + "',Comments='" + comment + "' WHERE Name="
                    + "'" + Name + "'";
            int resultSet = MysqlConnection.getDbCon().update(sql);
            mode = "";

        }
        RequestDispatcher dis = req.getRequestDispatcher("CrudOperations?action=");
        dis.forward(req, resp);
    }

    private void editfunc(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, SQLException {
        System.out.println("Edit Function is called");
        mode = "update";
        RequestDispatcher view = req.getRequestDispatcher("UserProfile.jsp");
        view.forward(req, resp);

    }

    private void deletefunc(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, SQLException {
        System.out.println("delete called");

        String name = req.getParameter("name");
        System.out.println("Name=" + name);

        String sql = "DELETE FROM user_profile WHERE Name=" + "'" + name + "'";
        System.out.println("Name=" + name);

        int resultSet = MysqlConnection.getDbCon().delete(sql);
        RequestDispatcher dis = req.getRequestDispatcher("CrudOperations?action=");
        dis.forward(req, resp);

    }

    private void listfunc(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException, SQLException {
        System.out.println("list called");
        String query = "SELECT * FROM user_profile";
        ResultSet resultSet = MysqlConnection.getDbCon().query(query);
        userProfile.clear();

        while (resultSet.next()) {
            userProfile.add(new UserProfileGetter(resultSet.getString("Name"), resultSet.getString("Age"),
                    resultSet.getString("Address"), resultSet.getString("Mobile_number"),
                    resultSet.getString("mail_address"), resultSet.getString("Comments")));

        }
        System.out.println(userProfile);
        req.setAttribute("userProfile", userProfile);
        RequestDispatcher dis = req.getRequestDispatcher("UsersINDatabase.jsp");
        dis.forward(req, resp);
    }

}