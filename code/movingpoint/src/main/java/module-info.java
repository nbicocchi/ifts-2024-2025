module org.example.movingpoint {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.movingpoint to javafx.fxml;
    exports org.example.movingpoint;
}