module de.medieninformatik.client {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.medieninformatik.client to javafx.fxml;
    exports de.medieninformatik.client;
}