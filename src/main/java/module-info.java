module com.example.m05loancalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.m05loancalculator to javafx.fxml;
    exports com.example.m05loancalculator;
}