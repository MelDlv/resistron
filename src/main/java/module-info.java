module com.example.resistrontest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.resistrontest to javafx.fxml;
    exports com.example.resistrontest;
}