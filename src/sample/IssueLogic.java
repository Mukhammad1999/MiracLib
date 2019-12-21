package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import sample.dbController.DBConnection;

import java.sql.Connection;
import java.sql.Statement;


public class IssueLogic {
    @FXML private TextField bookid;
    @FXML private TextField studentid;
    @FXML private Label Overdue_detector;
    DBConnection dbConnection = new DBConnection();

    public void Issue(ActionEvent event){
        try{
       String bookiddb = bookid.getText();
       String studentiddb = studentid.getText();
       Connection conn = dbConnection.getConnection();
       Statement statement = conn.createStatement();
       if (statement.execute("SELECT overdue from issue where student_id = '"+studentiddb+"';") == false){
           statement.execute("INSERT INTO issue(student_id,book_id) values ('"+studentiddb+"','"+bookiddb+"');");
           
           System.out.println("Gachibas");
       }else{
           Overdue_detector.setText("OVERDUE!");
       }




        }
        catch (Exception ex){

        }



    }
}
