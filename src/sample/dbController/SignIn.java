package sample.dbController;

import java.sql.*;
import sample.dbController.DBConnection;



// JDK 1.7 and above
public class SignIn
{
    DBConnection dbConnection;
    private  String userName;
    private  String password;

    public SignIn(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public boolean checkUserName() {

        Boolean isTrue = false;

        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

                ) {

            String strSelect = ("select * from id from users where id = " + userName + ";");

            ResultSet resultSet = st.executeQuery(strSelect);

            resultSet.getString("id");

            if(resultSet.getString("id") == this.userName){
                isTrue = true;
            }
            else{
                isTrue = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return isTrue;
    }


    public boolean checkPass() {

        Boolean isTrue = false;

        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

        ) {

            String strSelect = ("select * from id from users where id = " + password + ";");

            ResultSet resultSet = st.executeQuery(strSelect);

            resultSet.getString("password");

            if(resultSet.getString("password") == this.password){
                isTrue = true;
            }
            else{
                isTrue = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return isTrue;
    }















    public String getPassword() {
        return password;
    }

}