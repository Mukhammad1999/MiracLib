package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import sample.dbController.User;


import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.ResourceBundle;

public class StudentInfo implements Initializable {


    @FXML private Label forpass;
    @FXML private Label forbook;
    @FXML private Label forstatus;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        forpass.setText(User.getUserPass());
        forbook.setText(getbookid());
        overduedetector();
        if(overduedispl()){
            forstatus.setText("Yes");
        }else{
            forstatus.setText("No");
        }
    }


    public  String getbookid(){
        Integer bookId = 5;
        StringBuilder appender = new StringBuilder();

        String query = "SELECT * from issue where studentid ='"+User.getUserId()+"';";
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
            Statement statement = conn.createStatement()){
            ResultSet set = statement.executeQuery(query);
            while (set.next()){
                bookId = set.getInt("bookid");
            }
            ResultSet resultSet = statement.executeQuery("SELECT * from  books where id ="+bookId+"");

            while(resultSet.next()){
                appender.append(resultSet.getString("title"));
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return  appender.toString();
     }

     public void overduedetector(){
         String borrowed_time;
         String id_of_book;
        String query ="SELECT * from issue where studentid = '"+User.getUserId()+"';";
         try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             Statement statement = conn.createStatement()){
             ResultSet set = statement.executeQuery(query);
             while (set.next()){
                 borrowed_time = set.getString("borrowed_time");
                 id_of_book = set.getString("bookid");
                 if ( chechData(borrowed_time))
                 {
                     statement.executeUpdate("UPDATE issue set overdue=true where bookid ='"+id_of_book+"';");
                 }

             }
         }
         catch (Exception ex){
             ex.printStackTrace();
         }

     }
     public boolean overduedispl(){
        Boolean istrue = false;
         try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             Statement statement = conn.createStatement()){
             ResultSet rset = statement.executeQuery("SELECT*from issue where studentid='"+User.getUserId()+"';");
             while (rset.next()){
                 istrue = rset.getBoolean("overdue");
             }
         }
         catch (Exception ex){

         }
         return istrue;

     }

     public boolean chechData(String a) {
        int borrowed_day;
        int borrowed_week;
         Calendar temp = Calendar.getInstance();
         String[] tokens = a.split("/");

         borrowed_week = Integer.parseInt(tokens[0]);
         borrowed_day = Integer.parseInt(tokens[1]);
         if (borrowed_week<temp.getWeeksInWeekYear()) {
             if (borrowed_day<=temp.get(Calendar.DAY_OF_MONTH)) {
                 return true;
             }
         }
         return false;
     }
}
