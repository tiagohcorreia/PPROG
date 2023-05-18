module com.example.contadordecliques {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contadordecliques to javafx.fxml;
    exports com.example.contadordecliques;
}