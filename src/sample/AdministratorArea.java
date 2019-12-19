package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sample.dbController.User;

import java.io.IOException;
import java.sql.*;

public class AdministratorArea extends User {
        @FXML
        private ComboBox librarianFunction;

        @FXML
         private AnchorPane anchorPane;
        ObservableList<String> functionSet = FXCollections.observableArrayList("AddBook","DisplayBooks", "ModifyBook","DeleteBook","DeleteStudent");


   public AdministratorArea( String userName, String password) {
        super(userName, password);
    }

    @FXML
        public void AddUser(ActionEvent event)throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpPage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }
        public void initialize() {
            librarianFunction.setItems(functionSet);
        }
        public void FunctionSet(ActionEvent event) throws IOException{
            if(librarianFunction.getValue() == "AddBook"){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookAdder.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            }
            else if(librarianFunction.getValue() == "DisplayBooks"){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BookDisplayer.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            }
            else if(librarianFunction.getValue() == "DeleteBook"){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DeleteBookDialog.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            }
        }
        public void BackButton(ActionEvent event) throws IOException{



        }


    }


