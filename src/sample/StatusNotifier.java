package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class StatusNotifier {
    @FXML
    public AnchorPane anchorPane;
    @FXML private  SignUpControllerLibr signUpControllerLibr;
    public void MainPageBut(ActionEvent event)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TitlePage.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root1));
        stage.show();
    }
    public void Changer1() {
        if (signUpControllerLibr.Changer() == 1) {
            anchorPane.setStyle("-fx-background-color:white");
        }
    }
    public void injectSignupController(SignUpControllerLibr signUpControllerLibr){
        this.signUpControllerLibr = signUpControllerLibr;
    }
    public int getCheck(){
        return signUpControllerLibr.Changer();
    }

    public void changeStatus(ActionEvent event){
        anchorPane.setStyle("-fx-background-color:white");
    }




}
