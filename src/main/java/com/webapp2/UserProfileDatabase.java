package com.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

/**
 * UserProfileDatabase
 */
@WebServlet("/UserProfileDatabase")
public class UserProfileDatabase extends HttpServlet {

    private static final long serialVersionUID = 1L;
    ArrayList<UserProfileGetter> userProfile = new ArrayList<UserProfileGetter>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String Name = req.getParameter("Name");
        String Age = req.getParameter("age");
        String Address = req.getParameter("address");
        String Moblile_number = req.getParameter("mobile_number");
        String Email_address = req.getParameter("email_address");
        String comment = req.getParameter("comment");

        System.out.println(Name + Age + Address + Moblile_number + Email_address + comment);

        try {
            String sql = "INSERT INTO user_profile(Name,Age,Address,Mobile_number,mail_address,Comments) VALUES('"
                    + Name + "','" + Age + "','" + Address + "','" + Moblile_number + "','" + Email_address + "','"
                    + comment + "')";
            int resultSet = MysqlConnection.getDbCon().insert(sql);
            System.out.println(resultSet);
        } catch (Exception e) {
            // TODO: handle exception
        }

        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        try {
            String sql = "SELECT * FROM user_profile";
            ResultSet resultSet = MysqlConnection.getDbCon().query(sql);
            userProfile.clear();

            while (resultSet.next()) {
                userProfile.add(new UserProfileGetter(resultSet.getString("Name"), resultSet.getString("Age"),
                        resultSet.getString("Address"), resultSet.getString("Mobile_number"),
                        resultSet.getString("mail_address"), resultSet.getString("Comments")));

            }
            req.setAttribute("userProfile", userProfile);
            RequestDispatcher dis = req.getRequestDispatcher("UsersINDatabase.jsp");
            dis.forward(req, resp);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
