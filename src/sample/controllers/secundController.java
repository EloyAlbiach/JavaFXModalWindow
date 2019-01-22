package sample.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class secundController {
    @FXML
    private TextField namefield;

    @FXML
    public void closeSecund(ActionEvent event){
        // Obtenim l'objecte que ha generat l'esdeveniment
        Node source = (Node) event.getSource();
        // Obtenim la finestra associada a aquest objecte
        Stage stage = (Stage) source.getScene().getWindow();
        // tanquem la finestra
        stage.close();
    }

    public String getName(){
        return namefield.getText();
    }
}
