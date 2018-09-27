package com.webapp2;
import java.sql.*;
import java.sql.DriverManager;

/**
 * MysqlConnection
 */
public final class MysqlConnection {
 
    public Connection conn;
    private Statement statement;
    public static MysqlConnection db;

  
    MysqlConnection() {
        String url= "jdbc:mysql://localhost:3306/";
        String dbName = "food_store";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);}
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }
    /**
     *
     * @return MysqlConnect Database connection object
     */
    public static synchronized MysqlConnection getDbCon() {
        if ( db == null ) {
            db = new MysqlConnection();
        }
        return db;
 
    }




   public ResultSet query(String query)throws SQLException{
    System.out.println(query);
    statement=db.conn.createStatement();
    ResultSet res=statement.executeQuery(query);
    System.out.println(res);      
    return res;
   }
   
   public int insert(String insertQuery) throws SQLException {

    System.out.println("XXXXXXXXXXXXXXXX  Insert Called");
    System.out.println(insertQuery);
    statement = db.conn.createStatement();
    int result = statement.executeUpdate(insertQuery);
    return result;

}


public int delete(String insertQuery) throws SQLException {
    System.out.println(insertQuery);
    statement = db.conn.createStatement();
    int result = statement.executeUpdate(insertQuery);
    return result;

}


public int update(String insertQuery) throws SQLException {
    System.out.println(insertQuery);
    statement = db.conn.createStatement();
    int result = statement.executeUpdate(insertQuery);
    return result;

}
    
}