package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;




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
    public void SignIn(ActionEvent event){
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



    }
}
