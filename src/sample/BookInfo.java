package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BookInfo extends BookDisplayer{
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


    public void initialize(){
        loaddata();

    }

    private void loaddata() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
            Statement statement = conn.createStatement();
        }


        catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
