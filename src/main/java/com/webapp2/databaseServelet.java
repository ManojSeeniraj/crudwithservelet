package com.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * databaseServelet
 */
@WebServlet("/databaseServelet")
public class databaseServelet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    ArrayList<databaseGetter> foodList = new ArrayList<databaseGetter>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String price=req.getParameter("price");
        String taste=req.getParameter("taste");
        Float discount=Float.parseFloat(req.getParameter("discount"));

        System.out.println(id+name+price+taste+discount);

        try {
            String sql = "INSERT INTO food_items (id, name, price,taste,discount) VALUES (?,?,?,?,?)";
	Connection connect = DriverManager
    .getConnection("jdbc:mysql://localhost:3306/food_store?" + "user=root&password=");
    PreparedStatement statement = (PreparedStatement) connect.prepareStatement(sql);
    statement.setInt(1, id);
    statement.setString(2, name);
    statement.setString(3, price);
    statement.setString(4, taste);
    statement.setFloat(5, discount);
     
    boolean rowInserted = statement.executeUpdate() > 0;
    statement.close();
    // disconnect();
    connect.close();
    // return rowInserted;
    doGet(req, resp);
} catch (SQLException e) {
    e.printStackTrace();
}

}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out=resp.getWriter();


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/food_store?" + "user=root&password=");
            Statement statement=connect.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from food_items");
            foodList.clear();

            while (resultSet.next()) {
                foodList.add(new databaseGetter(resultSet.getInt("id"),resultSet.getString("name"),resultSet.getString("price"),resultSet.getString("taste"),resultSet.getFloat("discount")));
                System.out.println(foodList);
                
            }
            req.setAttribute("foodList",foodList);
			RequestDispatcher dis = req.getRequestDispatcher("databasedisplay.jsp");
            dis.forward(req,resp);
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            //TODO: handle exception
        } catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (out != null)
				out.close();
		}
    }

    
}