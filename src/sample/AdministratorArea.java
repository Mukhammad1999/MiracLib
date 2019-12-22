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

public class AdministratorArea {
        @FXML
        private ComboBox librarianFunction;
        @FXML private ComboBox usermanage;
        private String userName, password;
        @FXML
        Label userId;

        @FXML
         private AnchorPane anchorPane;
        ObservableList<String> functionSet = FXCollections.observableArrayList("AddBook","DisplayBooks", "ModifyBook","DeleteBook");
        ObservableList<String> userFunctionSet = FXCollections.observableArrayList("Add User","Delete User");

        public void initialize() {
            librarianFunction.setItems(functionSet);
            usermanage.setItems(userFunctionSet);
            userId.setText(User.getUserId());
        }

        public void FunctionSet(ActionEvent event) throws IOException{
            if(librarianFunction.getValue() == "AddBook"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("BookAdder.fxml")));
            }
            else if(librarianFunction.getValue() == "DisplayBooks"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("BookDisplayer.fxml")));
            }
            else if(librarianFunction.getValue() == "DeleteBook"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("DeleteBookDialog.fxml")));

            }else if(librarianFunction.getValue() == "ModifyBook"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("Modifier.fxml")));
            }
        }
        public void UserFunctionSet(ActionEvent event) throws IOException{
            if(usermanage.getValue() == "Add User"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("SignUpPage.fxml")));
            }
            else if(usermanage.getValue() == "Delete User"){
                anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("DeleteUser.fxml")));
            }
        }
        public void LogOut(ActionEvent event) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignInPage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root1));
            stage.show();
        }
    }



