package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


import javafx.stage.Stage;
import sample.dbController.User;

public class SingInController  {
    @FXML
    private TextField loginarea;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label forlogin;
    @FXML
    private Label forpass;
    @FXML
    private Label icons;
    @FXML
    public void SignIn(ActionEvent event) throws IOException {


        String login = loginarea.getText();
        String password = passwordField.getText();

        if(loginarea.getText().isEmpty()) {
            forlogin.setText("The Login area cannot be empty");
        }else{
            login= loginarea.getText();
            forlogin.setText("");
        }
        if(passwordField.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
        }
        else{
            password = passwordField.getText();
            forpass.setText("");
        }
        if ((!loginarea.getText().isEmpty()) &&(!passwordField.getText().isEmpty())){
            User user = new User(loginarea.getText(), passwordField.getText());
            if(!user.checkUserName() && (login.charAt(0) == 'L' || login.charAt(0) == 'S')){
                icons.setText("Incorrect ID");
            }
            if(!user.checkPass()) {
                icons.setText("Incorrect Password");
            }
            if(user.checkUserName() && user.checkPass() ){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AdministratorArea.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root1));
                stage.show();
            }
            else if(user.checkUserName() && user.checkPass()){
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LibrarianPage.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root1));
                stage.show();
            }

        }
        else {
            icons.setText("The data is inconsistent");
        }
    }

    public void BackButt(ActionEvent event)throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TitlePage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}
