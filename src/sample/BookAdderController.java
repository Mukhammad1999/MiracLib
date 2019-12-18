package sample;

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
import sample.dbController.DBConnection;

import java.awt.*;
import java.io.File;
import java.io.IOException;


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
DBConnection dbConnection;

    @FXML
    public void Back(ActionEvent event)throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LibrarianPage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void Accept(ActionEvent event){
        Integer dbbookid = Integer.parseInt(bookid.getText());
        String dbtitle = title.getText();
        String dbgenre = (String)genre.getValue();
        String dbisbn = isbn.getText();
        Integer dbbookcount = Integer.parseInt(book_count.getText());
        Boolean dbisavail = true;


        if((!title.getText().isEmpty()) && (!bookid.getText().isEmpty()) && (!book_count.getText().isEmpty()) && (!isbn.getText().isEmpty())&&(!genre.getItems().isEmpty())) {
            String qu = "INSERT INTO public.books(id,title,genre,isbn,isavail,book_count)"+
               "VALUES("+
                    "'"+ dbbookid+"',"
                    +"'"+ dbtitle+"',"
                    +"'"+ dbgenre+"',"
                    +"'"+ dbisbn+"',"
                    +"'"+ true+"',"
                    +"'"+ dbbookcount+"'"
                   + ")";
            if(dbConnection.executeAction(qu)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);

                alert.setContentText("Succes");
                alert.showAndWait();
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);

                alert.setContentText("Failure");
                alert.showAndWait();

            }

        }
        else{

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
