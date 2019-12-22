package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Calendar;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("TitlePage.fxml"));
        primaryStage.setTitle("MiracLib Library by APJ Students");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
        Calendar temp = Calendar.getInstance();
        System.out.println(temp.getWeeksInWeekYear() + "/" + temp.get(Calendar.DAY_OF_MONTH));
        System.out.println(temp.get(Calendar.DAY_OF_MONTH));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
