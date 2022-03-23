module com.example.javafx_velikost_obraz_rozliseni {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_velikost_obraz_rozliseni to javafx.fxml;
    exports com.example.javafx_velikost_obraz_rozliseni;
}