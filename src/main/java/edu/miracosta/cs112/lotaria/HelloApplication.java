package edu.miracosta.cs112.lotaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static final LoteriaCard[] LOTERIA_CARDS = {
            new LoteriaCard("Las matematicas", "1.png", 1),
            new LoteriaCard("Las ciencias", "2.png", 2),
            new LoteriaCard("La Tecnología", "8.png", 8),
            new LoteriaCard("La ingeniería", "9.png", 9),
    };

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/edu/miracosta/cs112/lotaria/loteriaintellij/hello-view.fxml"));
        Scene homeScreen = new Scene(fxmlLoader.load(), 900, 900);
        stage.setTitle("Loteria!");
        stage.setScene(homeScreen);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}