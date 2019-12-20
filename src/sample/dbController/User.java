package sample.dbController;

import java.sql.*;
import sample.dbController.DBConnection;



// JDK 1.7 and above
public class User
{
    DBConnection dbConnection;
    protected   String userName;
    private     String pasSword;

    public User(String userName, String password) {
        this.userName = userName;
        this.pasSword = password;
        System.out.println("Sas");
    }
    public User(){
        this.userName = "";
        this.pasSword = "";
    }


   /* public boolean is_admin(){
        Boolean isAdmin = false;
        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

        ) {


            String strSelect = ("SELECT * FROM users WHERE id like \"427215%\" AND is_admin=true;");
            ResultSet resultSet = st.executeQuery(strSelect);

            resultSet.getString("id");

            if(resultSet.getString("id") == this.userName){
                isAdmin = true;
            }
            else{
                isAdmin = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return isAdmin;

    }*/


    public boolean checkUserName() {

        Boolean isTrue = false;

        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

                ) {

            String strSelect = ("select id from users where id = " + this.userName + ";");

            ResultSet resultSet = st.executeQuery(strSelect);

            resultSet.getString("id");

            if(resultSet.getString("id") == this.userName){
                System.out.println("User is true");
                isTrue = true;
            }
            else{
                System.out.println("User is false");
                isTrue = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return isTrue;
    }


  /*  public boolean checkPass() {

        Boolean isTrue = false;

        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");
                Statement st = co.createStatement();
        ) {

            String strSelect = ("select password from users where password = " + this.pasSword + ";");

            ResultSet resultSet = st.executeQuery(strSelect);
            resultSet.getString("password");
            if(resultSet.getString("password") == this.pasSword){
                System.out.println("Pass is true");
                isTrue = true;
            }
            else{
                System.out.println("Pass is false");
                isTrue = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isTrue;
    }*/


    




    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return pasSword;
    }

}
