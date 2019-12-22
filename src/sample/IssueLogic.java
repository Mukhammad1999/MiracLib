package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import sample.dbController.DBConnection;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class IssueLogic implements Initializable {
    DBConnection dbConnection = new DBConnection();

    @FXML private TextField bookid;
    @FXML private TextField studentid;
    @FXML private Label overdue_detector;
    @FXML private Label nofound;
    @FXML private Label isavail;


    public void LoadInfo(ActionEvent event){
        System.out.println("Be");
        Integer id1 = Integer.parseInt(bookid.getText());
        String qu = "SELECT * FROM books where id = "+id1+"";
        String stid = studentid.getText();
        String qu1 = "SELECT * FROM users where id ='"+stid+"';";



        Boolean isfound = false;
       try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
            Statement statement = conn.createStatement()){
           ResultSet rset = statement.executeQuery(qu);
           while (rset.next()) {
               System.out.println("Be");
               String bookname = rset.getString("title");
               Boolean bstatus = rset.getBoolean("isavail");
               isfound = true;
               nofound.setText(bookname);
               String status = (bstatus)?"Availbale" : "NotAvailabe";
               isavail.setText(status);
           }
           if (!isfound) {
               nofound.setText("Book is not found in database");
               System.out.println("Not found");
           }
           Boolean babka = false;
           ResultSet resultSet = statement.executeQuery(qu1);
           while (resultSet.next()){
               System.out.println("Zawel");
               String sid = resultSet.getString("id");
               babka = true;
               System.out.println(sid);
               overdue_detector.setText("found");
           }
           if(!babka){
               overdue_detector.setText("Not found");
           }

       }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    public void ConfirmIssue(ActionEvent event) throws SQLException {
        if(!studentid.getText().isEmpty()&&(!bookid.getText().isEmpty())){
        String userId = studentid.getText();
        Integer bookId = Integer.parseInt(bookid.getText());
        String sql2 ="UPDATE books set isavail =false where id = +bookId+;";

        try(Connection conn = DriverManager.getConnection( "jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");
            PreparedStatement ment = conn.prepareStatement("INSERT into issue(studentid,bookid) values (?,?)")) {
            ment.setString(1, userId);
            ment.setInt(2, bookId);

            Statement statement = conn.createStatement();

            if (ment.execute() && statement.execute(sql2)) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Confirmed");
                alert.setContentText("Success");
                alert.showAndWait();
            } else {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("NotConfirmed");
                alert.setContentText("Bibametr");
                alert.showAndWait();
            }
        }
        }else{
            System.out.println("Why so hatred");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Data empty");
            alert.setContentText("Data is empty");
            alert.showAndWait();

        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
