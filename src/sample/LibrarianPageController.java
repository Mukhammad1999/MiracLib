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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;

import sample.dbController.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LibrarianPageController {
    @FXML
    private ComboBox librarianFunction;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label userId;
    @FXML
    private ComboBox usermanage;
    ObservableList<String> functionSet = FXCollections.observableArrayList("AddBook","DisplayBooks", "ModifyBook","DeleteBook");
    ObservableList<String> userfunctionSet = FXCollections.observableArrayList("Add Student","Delete Student","Issue Book");
    @FXML
    public void AddStudent(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUpPageForLibrarian.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();

    }
    public void initialize() {
        librarianFunction.setItems(functionSet);
        usermanage.setItems(userfunctionSet);
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
        }
        else if(librarianFunction.getValue() == "ModifyBook"){
            anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("Modifier.fxml")));

        }
    }
    public void UserFunctionSet(ActionEvent event) throws IOException{
        if(usermanage.getValue() == "Add Student"){
            anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("SignUpPageL.fxml")));
        }
        else if(usermanage.getValue() == "Delete Student"){
            anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("DeleteUser.fxml")));

        } else if (usermanage.getValue() == "Issue Book") {
            anchorPane.getChildren().setAll((Node) FXMLLoader.load(getClass().getResource("Issue.fxml")));
        }

    }

    public void BackButton(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignInPage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();

    }
}
