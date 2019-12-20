package sample;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.dbController.DBConnection;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class  BookModifierController {
    @FXML
    private TextField forPOP;
    @FXML
    private TextField title;
    @FXML
    private TextField genre;
    @FXML
    private TextField isbn;
    @FXML
    private TextField book_count;
    String title_to_find;


    public BookModifierController() throws IOException {
        getModifyPop();

    }
    public void  getModifyPop() throws IOException{

    }
    public void Modify(ActionEvent event) throws IOException{
       title_to_find= forPOP.getText();
       System.out.println(title_to_find);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Modifier.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.setTitle("Modify needed parts");
        stage.show();
    }
    public void Submit(ActionEvent event){
            try{

                String title_to_changed = title.getText();
                String genre_to_changed = genre.getText();
                String isbn_to_changed = isbn.getText();
                Integer book_count_to_changed = Integer.parseInt(book_count.getText());
                 Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
                 Statement stm = conn.createStatement();
                 stm.executeUpdate("UPDATE books set title = "+title_to_changed+" where title = "+title_to_find+";");
            }
            catch ( SQLException ex){

            }








    }





}
