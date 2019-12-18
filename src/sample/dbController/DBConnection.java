package sample.dbController;

import java.sql.*;

public class DBConnection {
    private Connection conn;
    private static DBConnection dbConnection;

    public DBConnection() {
        try {
            Class.forName("com.postgres.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
        }

        catch(ClassNotFoundException ex){
        }
        catch (SQLException sql){

        }
    }

    public Connection getConnection() {
        return conn;

    }

}




