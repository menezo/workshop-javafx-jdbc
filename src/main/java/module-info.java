module com.menezo.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.menezo.workshopjavafxjdbc to javafx.fxml;
    exports com.menezo.workshopjavafxjdbc;
}