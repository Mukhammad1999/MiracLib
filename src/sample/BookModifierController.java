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
import java.sql.*;

public class  BookModifierController {
    @FXML
    private TextField forID;
    @FXML
    private TextField title;
    @FXML
    private TextField genre;
    @FXML
    private TextField isbn;
    @FXML
    private TextField book_count;
    Integer id_to_find;



    public void Submit(ActionEvent event){
        id_to_find= Integer.parseInt(forID.getText());
        System.out.println(id_to_find);
        String title_to_changed = title.getText();
        String genre_to_changed = genre.getText();
        String isbn_to_changed = isbn.getText();
        String sql ="UPDATE books set title =? where id = ?";


        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title_to_changed);
            pstmt.setInt(2, id_to_find);
            pstmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }





}
