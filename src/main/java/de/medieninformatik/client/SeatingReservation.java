package de.medieninformatik.server.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SeatingReservation extends Application {
    public static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SeatingReservation.class.getResource("seating-overview.fxml"));
        scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Nightingale Theatre Seating");
        primaryStage.setScene(scene); // set the scene
        primaryStage.show();
    }

    public static Node findNode() {
        return scene.lookup("#testid");
    }

    public static void main(String[] args) {
        launch();
    }
}
