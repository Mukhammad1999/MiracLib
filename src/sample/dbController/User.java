package sample.dbController;

import java.sql.*;
import java.util.Arrays;

import sample.dbController.DBConnection;



// JDK 1.7 and above
public class User
{
    DBConnection dbConnection;
    protected static   String userName;
    private   static   String password;

    public User(String userNamee, String passwordd) {
        userName = userNamee;
        password = passwordd;
    }
    public User(){
        this.userName = "";
        this.password = "";
    }

    public static String getUserId() {
        System.out.println("13123");
        System.out.println(userName);
        return userName;
    }
    public static String getUserPass() {
        return password;
    }

    public boolean checkUserName() {
        boolean is_boolean = false;
        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

                ) {
            //System.out.println(this.userName.charAt(0));
            System.out.println(userName);
            ResultSet rs = st.executeQuery("SELECT FROM users WHERE id = '"+this.userName+"'");
            if (rs.next()) is_boolean = true;
            else is_boolean = false;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return is_boolean;
    }


    public boolean checkPass() {
        boolean is_boolean = false;
        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");
                Statement st = co.createStatement();
        ) {
            ResultSet rs = st.executeQuery("SELECT FROM users WHERE password = '"+this.password+"'");
            if (rs.next()) is_boolean = true;
            else is_boolean = false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return is_boolean;
    }


    




    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}
