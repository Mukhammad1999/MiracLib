package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpControllerLibr {
    @FXML
    private RadioButton StudentRadioButton;
    @FXML
    private RadioButton LibRaioButton;
    @FXML
    private TextField loginarea;
    @FXML
    private TextField passwordarea;

    @FXML
    private Label forlogin;
    @FXML
    private Label forpass;
    @FXML
    private Label incons;
    @FXML StatusNotifier contr;
    @FXML int check;

    public void SignUpBut(ActionEvent event) throws IOException {
        String login = loginarea.getText();
        String password = passwordarea.getText();
        if(loginarea.getText().isEmpty()) {
            forlogin.setText("The Login area cannot be empty");
            login= loginarea.getText();
        }else{
            forlogin.setText("");
        }
        if(passwordarea.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
            password = passwordarea.getText();
        }
        else{
            forpass.setText("");
        }
        if ((!loginarea.getText().isEmpty()) && (!passwordarea.getText().isEmpty())) {
            check = 1;
        }
        else{
            incons.setText("The data is inconsistant");
            check = 0;

        }
    }

    public int Changer(){
        if(check==1){
            return this.check;
        }else{
            return 0;
        }
    }




}
