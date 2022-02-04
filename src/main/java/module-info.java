module com.example.gitest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitest to javafx.fxml;
    exports com.example.gitest;
}