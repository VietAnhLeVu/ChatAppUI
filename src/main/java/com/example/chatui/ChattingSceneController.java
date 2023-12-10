package com.example.chatui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

public class ChattingSceneController implements Initializable,ImageResource {

    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    private Circle avatar1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        avatar1.setFill(imagePattern1);
    }

    public void switchtoMainui(MouseEvent mouseEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("mainui.fxml"));
        stage = (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
