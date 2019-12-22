package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.dbController.User;


import java.io.IOException;


public class StudentPage extends User {
    @FXML
    AnchorPane anchorPane;
    @FXML
    private Label forid;
    @FXML
    private Label forbook;
    @FXML private Label forstatus;
    public void Returnbook(ActionEvent event){

    }
    public void viewbooks(ActionEvent event)throws IOException {
        anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("BookDisplayer.fxml")));
    }
    public void LogOut(ActionEvent event)throws  IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignInPage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }





}
