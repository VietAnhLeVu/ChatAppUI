package com.example.chatui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mainui.fxml"));
        Scene scene = new Scene(root, 436, 815);

        stage.setResizable(false);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("telegram.png")));
        stage.setTitle("ChatApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}