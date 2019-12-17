package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import java.sql.*;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BootViewController  {
    @FXML
    private ComboBox librarianFunction;
    ObservableList<String> functionSet = FXCollections.observableArrayList("Add","DisplayBooks", "ModifyBook","DeleteBook","DeleteStudent");



    public void initialize() {
        librarianFunction.setItems(functionSet);
    }
    public void FunctionSet(ActionEvent event) throws IOException{
        if(librarianFunction.getValue() == "Add"){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookAdder.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root1));
            stage.show();
        }
        else if(librarianFunction.getValue() == "DisplayBooks"){

        }
        else if(librarianFunction.getValue() == "DeleteBook"){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteBookDialog.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root1));
            stage.show();
        }
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpPage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }

}
