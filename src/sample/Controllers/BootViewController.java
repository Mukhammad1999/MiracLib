package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class BootViewController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void AddBook(){
        try{
            FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("BookAdder.fxml"));
            Parent parent = (Parent)fxmlLoader.load();
            Stage bookadderwindow = new Stage();
            bookadderwindow.setTitle("Add the information here");
            bookadderwindow.setScene(new Scene(parent));
            bookadderwindow.show();

        }
        catch (Exception e){
            System.out.println("Cant load new window");
        }

    }
    public void DisplayBook(ActionEvent event){

    }

    public void ModifyBook(ActionEvent event){

    }
    @FXML
    public void Submitinformation(javafx.event.ActionEvent actionEvent){

    }

}
