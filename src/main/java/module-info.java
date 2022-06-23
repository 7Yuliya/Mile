module com.example.mili {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mili to javafx.fxml;
    exports com.example.mili;
}