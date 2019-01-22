package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Label lblNom;

    @FXML
    public void mostraSubfinestra(ActionEvent event) throws IOException {
        // Crea la nova finestra
        Stage secWindow = new Stage();
        // Carreguem l'fxml
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/sample/views/secund.fxml"));
        // Creem un scene basat en un AnchorPane ja que l'fxml també és un AnchorPane
        AnchorPane myScene = myLoader.load();
        // Obtenim el controlador associat a aquest scene
        secundController secundC = myLoader.getController();

        secWindow.setScene(new Scene(myScene, 305, 255));
        secWindow.setTitle("Secund");
        secWindow.initModality(Modality.APPLICATION_MODAL);
        secWindow.showAndWait();

        lblNom.setText(secundC.getName());
    }
}
