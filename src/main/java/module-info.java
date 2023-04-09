module com.armenise.fom_armenise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.armenise.fom_armenise to javafx.fxml;
    exports com.armenise.fom_armenise;
}