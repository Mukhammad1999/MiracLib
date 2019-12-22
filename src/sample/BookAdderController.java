package sample;

import com.sun.glass.ui.Window;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;


public class BookAdderController {
    ObservableList<String>genreList = FXCollections.observableArrayList("Adventure", "Novel", "Horror","Scientific", "Fantasy","Documentary");
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private TextField title;
    @FXML
private TextField bookid;
    @FXML
    private TextField book_count;
    @FXML
    private TextField isbn;
    @FXML
    private  TextField descr;
    @FXML Label info;
    @FXML
    private ComboBox genre;
    Connection conn;
    @FXML

    public void Back(ActionEvent event)throws IOException  {
        System.out.println("Cannot go back!");

    }
    @FXML
    public void Accept(ActionEvent event){
        Integer dbbookid = Integer.parseInt(bookid.getText());
        String dbtitle = title.getText();
        String dbgenre = (String)genre.getValue();
        String dbisbn = isbn.getText();
        Integer dbbookcount = Integer.parseInt(book_count.getText());
        Boolean dbisavail = true;


        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");
            Statement statement = conn.createStatement();
            statement.execute(String.format("INSERT INTO books (id,title, genre, isbn, isavail, book_count) VALUES (%d,'%s','%s','%s',%B, %d)",dbbookid,dbtitle,dbgenre,dbisbn, true,dbbookcount));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Success!");
            alert.showAndWait();
        }

        catch (Exception sql){
            sql.printStackTrace();
        }
    }
    @FXML
    public void initialize() {
        genre.setItems(genreList);

    }
    @FXML
    public void CoverFileChoose(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Please,choose the cover of the book");
        Stage stage =(Stage) anchorPane.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);

        if(file!=null){
            Image image = new Image("file:"+file);
            ImageView iv = new ImageView();
            iv.setImage(image);
            anchorPane.getChildren().add(iv);
        }
    }

}
