package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;


public class DeleteUserPage {
    @FXML private TextField findid;
    @FXML private Label foundpage;
    @FXML private ComboBox UserChooser;

    public void Isfound(ActionEvent event){
        String tobefound = findid.getText();

            try(
                    Connection connection =  DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                    Statement statement = connection.createStatement()
                    )
            {

                ResultSet set =statement.executeQuery("SELECT * from users where id = '"+tobefound+"';");
                while(set.next()){
                    String makarena = set.getString("id");
                    if(makarena == findid.getText()){
                        foundpage.setText("Found!Ready to delete");
                    }else{
                        foundpage.setText("Not found(sorry)");
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
    public void Delete(ActionEvent event){
        String tobefound = findid.getText();
        try(
                Connection connection =  DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = connection.createStatement()
        ) {
            if (!tobefound.isEmpty()) {

                if (statement.execute("DELETE from users where id ='" + tobefound + "';")==true) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("Success!");
                    alert.showAndWait();
                } else {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setContentText("ID Didn't Found!");
                    alert.showAndWait();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("ID Cannot be Empty!");
                alert.showAndWait();
            }
        }

        catch (SQLException ex) {
            ex.printStackTrace();
        }


    }


    }










/*else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("EMPTY ID");
            alert.setContentText("ID cannot be empty");

        }*/
