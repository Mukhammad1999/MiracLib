package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class BookInfo implements Initializable {
    private  String titlex;
    private  String genre;
    private  String isbn;
    private  Integer book_count;
    private  Integer id;
    private  Boolean isavail;
    @FXML
    private Label fortitle;
    @FXML
    private Label forgenre;
    @FXML
    private Label forisbn;
    @FXML
    private Label forcount;
    @FXML
    private Label forisavail;
    @FXML
    private Label forid;


    public BookInfo(String title, String genre, String isbn, Integer book_count, Integer id,Boolean isavail){
        this.titlex = title;
        this.genre = genre;
        this.isbn = isbn;
        this.book_count= book_count;
        this.id = id;
        this.isavail = isavail;
        loaddata();
    }
    public BookInfo(){
        this.titlex = "sos";
        this.genre = "public";
        this.isbn = "7536489";
        this.book_count= 45;
        this.id = 1;
        this.isavail = true;

    }
    public void getInfo(String title, String genre, String isbn, Integer book_count, Integer id,Boolean isavail){
        this.titlex = title;
        this.genre = genre;
        this.isbn = isbn;
        this.book_count= book_count;
        this.id = id;
        this.isavail = isavail;
        loaddata();
    }



    private void loaddata() {



        if(!titlex.isEmpty()&&!genre.isEmpty()&&(!isbn.isEmpty())){
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/Micralib", "postgres", "rahimho1499");

            Statement statement = conn.createStatement();
            ResultSet rset = statement.executeQuery("SELECT * from books where title = '"+titlex+"';");
            while(rset.next()){
                fortitle.setText(rset.getString("title"));
                forgenre.setText(rset.getString("genre"));
                int i = rset.getInt("book_count");
                forcount.setText(String.valueOf(i));
                forisbn.setText(rset.getString("isbn"));
                forid.setText(String.valueOf(rset.getInt("id")));
                if(rset.getBoolean("isavail")){
                    forisavail.setText("Yes");
                }else{
                    forisavail.setText("No");
                }
            }
            System.out.println("Kakaxa");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loaddata();
    }
}
