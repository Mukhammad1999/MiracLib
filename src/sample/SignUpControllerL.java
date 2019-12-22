package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUpControllerL {
    @FXML private TextField loginarea;
    @FXML private PasswordField passwordarea;
    @FXML private Label forlogin;
    @FXML private Label forpass;
    @FXML
    public void SigUp(ActionEvent event) {
        if (!loginarea.getText().isEmpty() && !passwordarea.getText().isEmpty()) {

            try {
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                Statement statement = conn.createStatement();

                statement.execute("INSERT INTO users (id, password, is_admin, is_active, is_student, is_librarian) " +
                        "VALUES ('S" + loginarea.getText() + "', '" + passwordarea.getText() + "', false, false, true, false)");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }else{
            if(loginarea.getText().isEmpty()){
                forlogin.setText("Empty login");
            }
            else if(passwordarea.getText().isEmpty()){
                forpass.setText("Empty Password");
            }

        }
    }


}
