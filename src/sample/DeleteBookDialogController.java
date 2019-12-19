package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DeleteBookDialogController {
    @FXML
    public TextField DelTitle;

    @FXML
    public void DeleteButton(ActionEvent event) throws IOException{
        String dbdeleteitem = DelTitle.getText();

        try(
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = connection.createStatement();
                Statement stmt = connection.createStatement();
        )

        {
            boolean bool = statement.execute("DELETE from books  where title = '"+dbdeleteitem+"';");
            System.out.println(bool);
            if(bool){
                Alert aler = new Alert(Alert.AlertType.ERROR);
                aler.setContentText("Error!");
                aler.showAndWait();

            }
            else{
                Alert aler = new Alert(Alert.AlertType.INFORMATION);
                aler.setContentText("Success");
                aler.showAndWait();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void Back(ActionEvent event) throws IOException{
    }


}
