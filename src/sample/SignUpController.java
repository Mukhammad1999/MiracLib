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
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;

public class SignUpController<idd> {
    @FXML
    private RadioButton studentRadioButton;
    @FXML
    private RadioButton librarianRadioButton;
    @FXML
    private TextField loginarea;
    @FXML
    private TextField passwordarea;
    @FXML
    private TextField e_mailarea;
    @FXML
    private Label forlogin;
    @FXML
    private Label forRadioButton;
    @FXML
    private Label forpass;
    @FXML
    private String is_admin;
    private Label incons;
    Connection conn;

    public void SignUpBut(ActionEvent event) throws IOException, SQLException {
        String login = loginarea.getText();//this variable to be passed in tables
        String password = passwordarea.getText();//this variable to be passed in tables
        if(loginarea.getText().isEmpty()) {
            forlogin.setText("The Login area cannot be empty");
        }
        if(passwordarea.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
        }
        if (studentRadioButton.selectedProperty().getValue() || librarianRadioButton.selectedProperty().getValue()) {
            forRadioButton.setText("You must choose one of this!");
        }
        if ( (!loginarea.getText().isEmpty()) && (!passwordarea.getText().isEmpty()) && (studentRadioButton.selectedProperty().getValue() || librarianRadioButton.selectedProperty().getValue()) ) {
            //logic for adding person to be here
            //A and L firstletters should be for Librarian and Administrator
            //S for students
            try {
                System.out.println(studentRadioButton.selectedProperty().getValue());
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = conn.createStatement();
//                Add student
                if ( studentRadioButton.selectedProperty().getValue() ) {
                    statement.execute("INSERT INTO users (id, password, is_admin, is_active, is_student, is_librarian) " +
                            "VALUES ('"+loginarea.getText()+"', '"+passwordarea.getText()+"', false, false, true, false)");
                }
//                Add librarian
                if (librarianRadioButton.selectedProperty().getValue()){
                    statement.execute("INSERT INTO users (id, password, is_admin, is_active, is_student, is_librarian) " +
                            "VALUES ('"+loginarea.getText()+"', '"+passwordarea.getText()+"', false, false, false, true)");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
//            incons.setText("The data is inconsistant");
        }
    }
    //Add you logic here




}
