package sample.dbController;

import java.sql.*;
public class User
{

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


}
