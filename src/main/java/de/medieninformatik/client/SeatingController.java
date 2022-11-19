package de.medieninformatik.server.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SeatingController {

    private Integer[] selectedSeat = new Integer[2];
    private boolean[][] seats = new boolean[10][20];

    public SeatingController() {
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 20; col++) {
                seats[row][col] = true;
            }
        }
    }

    @FXML
    private Button seatingBtn;

    @FXML
    protected void onSeatClick(ActionEvent e) {
        Node n = (Node) e.getSource();
        n.setStyle("-fx-background-color: #8c032d; -fx-border-color: #cb8e4a; -fx-border-radius: 5px; -fx-border-width: 2px; -fx-background-radius: 5px;");
        String s = n.getUserData().toString();
        selectedSeat[0] = Integer.parseInt(s.substring(0, 1));
        selectedSeat[1] = Integer.parseInt(s.substring(1));
        //showSeatArray();
    }

    @FXML
    protected void onReservationClick() {
        StackPane root2 = new StackPane();
        Label label = new Label("Your are now in the second form");
        root2.getChildren().add(label);
        Scene secondScene = new Scene(root2, 400, 200);
        Stage secondStage = new Stage();
        secondStage.setScene(secondScene); // set the scene
        secondStage.setTitle("Second Form");
        secondStage.show();
        Node n = SeatingReservation.findNode();
        setColor(n);
    }

    private void setColor(Node n) {
        if (n instanceof Button b) {
            b.setStyle("-fx-background-color: #505050; -fx-border-color: #cb8e4a; -fx-border-radius: 5px; -fx-border-width: 2px; -fx-background-radius: 5px;");
        }

    }

    private void showSeatArray() {
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[0].length; col++) {
                System.out.print(seats[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
