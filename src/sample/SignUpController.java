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
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;

public class SignUpController<idd> {
    @FXML
    private RadioButton StudentRadioButton;
    @FXML
    private RadioButton LibRaioButton;
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
    private String is_admin;
    private Label incons;
    Connection conn;
    String idd;
    public void SignUpBut(ActionEvent event) throws IOException, SQLException {
        String login = loginarea.getText();//this variable to be passed in tables
        String password = passwordarea.getText();//this variable to be passed in tables

        if(loginarea.getText().isEmpty()) {
            forlogin.setText("The Login area cannot be empty");
        }
        if(passwordarea.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
        }
        if ((!loginarea.getText().isEmpty()) && (!passwordarea.getText().isEmpty()) /*&& (!e_mailarea.getText().isEmpty())*/) {
            //logic for adding person to be here
            //A and L firstletters should be for Librarian and Administrator
            //S for students
            try {
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = conn.createStatement();
                statement.execute("INSERT INTO users (id, password, is_admin, is_active) VALUES ('"+loginarea.getText()+"','"+passwordarea.getText()+"' ,true,true)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
//            incons.setText("The data is inconsistant");
        }
    }
    //Add you logic here
    public boolean SignUpRadioButtonSelected(){
        if(StudentRadioButton.getText() == "librarian"){
            return false;
        }
        else{

            return true;
        }
    }




}
