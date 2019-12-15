package sample.dbController;

import java.sql.*;

public class DBConnection{
    private Connection conn;
    private static DBConnection dbConnection;

    private DBConnection()throws ClassNotFoundException,SQLException{
        Class.forName("com.postgres.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:postgres://localhost/Micralib","postgres","qwerty");
    }
    public Connection getConnection(){
        return conn;
    }
    public static DBConnection getDBConnection()throws ClassNotFoundException,SQLException{
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;
    }

}