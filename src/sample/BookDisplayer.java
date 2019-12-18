package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;


import java.awt.*;
import java.sql.*;
public class BookDisplayer {

    @FXML
    private AnchorPane rootPane;
    @FXML
    private TableView tableview;
    @FXML private TableColumn book;
    public void Display(ActionEvent event){
        try(
            Connection conn = DriverManager.getConnection( "jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");
            Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from books";
            ResultSet rst = stmt.executeQuery(strSelect);
            while (rst.next()){
                String sbook = rst.getString("books");

            }
        }


        catch (SQLException ex){

        }



    }

}