package sample;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



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
        if(!forID.getText().isEmpty()&&(!title.getText().isEmpty())&&(!genre.getText().isEmpty())&&(!isbn.getText().isEmpty())&&(!book_count.getText().isEmpty())){
        id_to_find= Integer.parseInt(forID.getText());
        System.out.println(id_to_find);
        String title_to_changed = title.getText();
        String genre_to_changed = genre.getText();
        String isbn_to_changed = isbn.getText();
        Integer book_count_to_be_changed = Integer.parseInt(book_count.getText());
        String sql ="UPDATE books set title =? where id = ?";
        String sql1 ="UPDATE books set genre =? where id = ?";
        String sql2 ="UPDATE books set  isbn =? where id = ?";
        String sql3 ="UPDATE books set  book_count =? where id = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, title_to_changed);
            pstmt.setInt(2, id_to_find);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
            pstmt1.setString(1, genre_to_changed);
            pstmt1.setInt(2, id_to_find);
            pstmt1.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
            pstmt2.setString(1, isbn_to_changed);
            pstmt2.setInt(2, id_to_find);
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
             PreparedStatement pstmt2 = conn.prepareStatement(sql3)) {
            pstmt2.setInt(1, book_count_to_be_changed);
            pstmt2.setInt(2, id_to_find);
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Data Cannot be EMPTY");
            alert.showAndWait();
        }
    }





}
