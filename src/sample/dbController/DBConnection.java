package sample.dbController;

import com.sun.glass.ui.Window;

import java.sql.*;

public class DBConnection {
    private Connection conn;
    private static DBConnection dbConnection;
    private static Statement statement;

    public DBConnection() {
        createconnection();
    }
    public void createconnection(){
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


    public Boolean executeAction(String qu){
        try {
            statement = conn.createStatement();
            statement.execute(qu);
            return true;
        }catch (SQLException ex){
            return false;
        }finally {

        }

    }
    public ResultSet executeQuery(String qu){
        ResultSet resultSet;
        try {
            statement = conn.createStatement();
            resultSet = statement.executeQuery(qu);
        }
        catch (SQLException ex){
            return null;
        }
        finally {

        }
        return resultSet;

    }

}




