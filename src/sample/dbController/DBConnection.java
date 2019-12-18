package sample.dbController;

import java.sql.*;

public class DBConnection implements Runnable{
    private Connection conn;
    private static DBConnection dbConnection;

    private DBConnection()throws ClassNotFoundException,SQLException{
        Class.forName("com.postgres.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:postgresql://localhost/Micralib","postgres","rahimho1499");
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

    @Override
    public void run() {
        System.out.println("Connected");
    }
}


