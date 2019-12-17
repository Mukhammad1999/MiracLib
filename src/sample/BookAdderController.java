package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class BookAdderController {
    ObservableList<String>genreList = FXCollections.observableArrayList("Adventure", "Novel", "Horror","Scientific", "Fantasy","Documentary");
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Pane paneforIMG;
    @FXML
    private TextField title;
    @FXML
private TextField author;
    @FXML
    private TextField year;
    @FXML
    private TextField in_stock;
    @FXML
    private  TextField descr;
@FXML
private ComboBox genre;
@FXML
private Label Infoview;

    @FXML
    public void Back(ActionEvent event)throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Booot_View.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    @FXML
    public void Accept(ActionEvent event){

        if((!title.getText().isEmpty()) && (!author.getText().isEmpty()) && (!year.getText().isEmpty()) && (!descr.getText().isEmpty())) {
            Infoview.setText("Title: " + title.getText()+"  Genre: " + genre.getValue()+"  Author: " + author.getText()+"  Descrip: " + descr.getText());

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
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        }
    }

}
