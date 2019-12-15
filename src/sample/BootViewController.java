package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BootViewController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void AddBook(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookAdder.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }
    public void DisplayBook(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BootAdder.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }

    public void ModifyBook(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Modifier.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }
    @FXML
    public void DeleteBook(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteBookDialog.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();


    }
    public void BackButton(ActionEvent event) throws IOException{

    }

}
