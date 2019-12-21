package sample.dbController;

import java.sql.*;
import sample.dbController.DBConnection;



// JDK 1.7 and above
public class User
{
    DBConnection dbConnection;
    protected   String userName;
    private     String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public User(){
        this.userName = "";
        this.password = "";
    }

    public boolean checkUserName() {
        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

                ) {
            System.out.println(this.userName.charAt(0));


            // Creating array of string length
//            char[] ch = new char[this.userName.length()];
//
//            // Copy character by character into array
//            for (int i = 0; i < this.userName.length(); i++) {
//                ch[i] = this.userName.charAt(i);
//            }
//            System.out.println(ch);

            if (st.execute("SELECT FROM users WHERE id = '"+this.userName+"'"))
            {
                System.out.println("id");
                System.out.println(st.executeUpdate("SELECT FROM users WHERE id = '"+this.userName+"'"));
                return true;
            } else {
                System.out.println("id");
                System.out.println(st.execute("SELECT FROM users WHERE id = '"+this.userName+"'"));
                return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean checkPass() {
        try(
                Connection co = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");

                Statement st = co.createStatement();

        ) {
            if (st.execute("SELECT FROM users WHERE password = '"+this.password+"'"))
            {
                System.out.println("pass");
                System.out.println(st.execute("SELECT FROM users WHERE password = '"+this.password+"'"));
                return true;
            } else {
                System.out.println("pass");
                System.out.println(st.execute("SELECT FROM users WHERE password = '"+this.password+"'"));
                return false;
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    




    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}
