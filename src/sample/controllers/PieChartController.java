package sample.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class PieChartController  implements Initializable {
    @FXML
    private Pane paneView;
    private Button actionButton;
    @FXML
    private ListView<String> listView;

    public void initialize (URL url, ResourceBundle rb) {
        loadData();
    }

    private void loadData ( ) {
        paneView.getChildren().clear();
        ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
        list.add(new PieChart.Data("book", 100));
        list.add(new PieChart.Data("Anime", 500));
        PieChart milkChart = new PieChart(list);
        milkChart.setLegendSide(Side.RIGHT);
        paneView.getChildren().add(milkChart);

        
    }

}
