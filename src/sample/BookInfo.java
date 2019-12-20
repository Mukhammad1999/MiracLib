package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class BookInfo  implements Initializable {
    @FXML
    private Label fortitle;
    @FXML
    private Label forgenre;
    @FXML
    private Label forisbn;
    @FXML
    private Label forcount;
    @FXML
    private Label forisavail;



    private void loaddata() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
            Statement statement = conn.createStatement();
            ResultSet rset = statement.executeQuery("SELECT title from books where title = 'Harry';");
            while(rset.next()){
                fortitle.setText(rset.getString("title"));
            }

            System.out.println("Kakaxa");
        }


        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loaddata();
    }
}
