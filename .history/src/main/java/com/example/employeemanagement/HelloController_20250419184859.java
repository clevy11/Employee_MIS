package com.example.employeemanagement;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private void goToEmployeeManagement() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("employee-view.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
            
            // Get current stage from any control in the scene
            Stage stage = (Stage) ((javafx.scene.Node)javafx.event.ActionEvent.ANY_SOURCE.getTarget()).getScene().getWindow();
            stage.setScene(scene);
            stage.setFullScreen(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}