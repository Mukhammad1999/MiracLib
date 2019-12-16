package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class SignUpController {
    @FXML
    private TextField loginarea;
    @FXML
    private TextField passwordarea;
    @FXML
    private TextField e_mailarea;
    @FXML
    private Label forlogin;
    @FXML
    private Label forpass;
    @FXML
    private Label foremal;
    @FXML
    private Label incons;

    public void SignUpBut(ActionEvent event) throws IOException {

        String login = loginarea.getText();
        String password = passwordarea.getText();
        String email = e_mailarea.getText();
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
        if(e_mailarea.getText().isEmpty()){
            foremal.setText("Email area cannot be empty");
            email = e_mailarea.getText();
        }else{
            foremal.setText("");
        }

        if ((!loginarea.getText().isEmpty()) && (!passwordarea.getText().isEmpty()) && (!e_mailarea.getText().isEmpty())) {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Booot_View.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root1));
            stage.show();
        }else{
            incons.setText("The data is inconsistant");
        }

    }
}
