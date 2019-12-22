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
        String login = loginarea.getText();
        String password = passwordarea.getText();
        if(loginarea.getText().isEmpty()) {
            forlogin.setText("The Login area cannot be empty");
        }
        if(passwordarea.getText().isEmpty()){
            forpass.setText("Password area cannot be empty");
        }

        if ( (!loginarea.getText().isEmpty()) && (!passwordarea.getText().isEmpty()) && (studentRadioButton.selectedProperty().getValue() || librarianRadioButton.selectedProperty().getValue()) ) {

            try {
                System.out.println(studentRadioButton.selectedProperty().getValue());
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = conn.createStatement();

                String a = "s" + loginarea.getText();
                System.out.println(a);
                if ( studentRadioButton.selectedProperty().getValue() ) {
                    statement.execute("INSERT INTO users (id, password, is_admin, is_active, is_student, is_librarian) " +
                            "VALUES ('S"+loginarea.getText()+"', '"+passwordarea.getText()+"', false, false, true, false)");
                }

                if (librarianRadioButton.selectedProperty().getValue()){
                    statement.execute("INSERT INTO users (id, password, is_admin, is_active, is_student, is_librarian) " +
                            "VALUES ('L"+loginarea.getText()+"', '"+passwordarea.getText()+"', false, false, false, true)");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{

        }
    }





}
