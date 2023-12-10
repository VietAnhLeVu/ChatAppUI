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

public class MainUIController implements Initializable,ImageResource {
    private Stage stage;
    private Scene scene;
    private Parent root;



    @FXML
    private Circle avatar1;

    @FXML
    private Circle avatar2;
    @FXML
    private Circle avatar3;
    @FXML
    private Circle avatar4;
    @FXML
    private Circle avatar5;
    @FXML
    private Circle avatar6;
    @FXML
    private Circle avatar7;
    @FXML
    private Circle avatar8;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        avatar1.setFill(imagePattern1);

        avatar2.setFill(imagePattern2);

        avatar3.setFill(imagePattern3);

        avatar4.setFill(imagePattern4);

        avatar5.setFill(imagePattern5);

        avatar6.setFill(imagePattern6);

        avatar7.setFill(imagePattern7);

        avatar8.setFill(imagePattern8);
    }

    public void switchToChattingscene(MouseEvent mouseEvent) throws IOException {
        root = FXMLLoader.load(getClass().getResource("chattingscene.fxml"));
        stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}