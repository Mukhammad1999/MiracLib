package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


import sample.dbController.User;

public class SingInController {
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
            login= loginarea.getText();
        }else{
            forlogin.setText("");
        }
        if(passwordField.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
            password = passwordField.getText();
        }
        else{
            forpass.setText("");
        }
        if ((!loginarea.getText().isEmpty()) &&(!passwordField.getText().isEmpty())){

            User user = new User(loginarea.getText(), passwordField.getText());

            if(user.checkUserName()==true && user.checkPass()==true){
                // there user will be directed further
            }
            else if(user.checkPass()==false){
                icons.setText("Incorrect Password");
            }
            else if(user.checkUserName()==false){
                icons.setText("Incorrect ID");
            }

        }
        else {
            icons.setText("The data is inconsistent");
        }
    }

    public void BackButt(ActionEvent event)throws IOException{

    }
}
