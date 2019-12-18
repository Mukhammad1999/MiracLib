package sample;

import javafx.beans.Observable;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import sample.dbController.DBConnection;


import java.awt.*;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class BookDisplayer implements Initializable {
ObservableList<Book> list = FXCollections.observableArrayList();
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TableView<Book> tableview;
    @FXML private TableColumn<Book,String> titleCol;
    @FXML private TableColumn<Book,String> genreCol;

    @FXML private TableColumn<Book,String> isbnCol;
    @FXML private TableColumn<Book,Boolean> isavailCol;
    @FXML private TableColumn<Book,Integer> bookcounCol;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initcol();
        loaddata();
    }
    private void loaddata() {
        try (
                Connection conn = DriverManager.getConnection( "jdbc:postgresql://localhost:5432/Micralib", "postgres", "rahimho1499");
                Statement stmt = conn.createStatement();
        )
        {
            String strSelect = "select * from books;";
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are:");
            while(rset.next()) {
                String titlex = rset.getString("title");
                String genre = rset.getString("genre");
                String isbn = rset.getString("isbn");
                Boolean isAvail = rset.getBoolean("isavail");
                Integer book_count = rset.getInt("book_count");
                list.add(new Book(titlex,genre,isbn,isAvail,book_count));
            }
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
        tableview.getItems().setAll(list);
    }
    private void initcol() {
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("genre"));
        isbnCol.setCellValueFactory(new PropertyValueFactory<>("isbn"));
        isavailCol.setCellValueFactory(new PropertyValueFactory<>("isavail"));
        bookcounCol.setCellValueFactory(new PropertyValueFactory<>("book_count"));
    }


    public static class Book{
            private final SimpleStringProperty title;
            private final SimpleStringProperty genre;
            private final SimpleStringProperty isbn;
            private final SimpleBooleanProperty isavail;
            private final SimpleIntegerProperty book_count;

        public Book(String title, String genre,String isbn, Boolean isavail, Integer book_count) {
            this.title = new SimpleStringProperty(title);
            this.genre = new SimpleStringProperty(genre);
            this.isbn = new SimpleStringProperty(isbn);
            this.isavail = new SimpleBooleanProperty(isavail);
            this.book_count = new SimpleIntegerProperty(book_count);
        }
        public String getTitle() {
            return title.get();
        }
        public String getGenre() {
            return genre.get();
        }
        public String getIsbn() {
            return isbn.get();
        }
        public boolean isIsavail() {
            return isavail.get();
        }
        public int getBook_count() {
            return book_count.get();
        }
    }
}