package edu.miracosta.cs112.lotaria;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText, titleLabel, messageLabel;

    @FXML
    private Button drawCardButton;

    @FXML
    private ImageView cardImageView;

    @FXML
    private ProgressBar gameProgressBar;

    @FXML
    protected void onHelloButtonClick() {
        Random random = new Random();
        int rand = random.nextInt(4);

        LoteriaCard loteriaCard = HelloApplication.LOTERIA_CARDS[rand];
        cardImageView.setImage(loteriaCard.getImage());
        titleLabel.setText(loteriaCard.getCardName());
    }

    @FXML
    public void initialize() {

    }
}