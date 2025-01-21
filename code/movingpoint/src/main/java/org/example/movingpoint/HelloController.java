package org.example.movingpoint;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private ImageView ship;

    void keyPressed(KeyEvent event) {
        System.out.println(event.getCode());

        if (event.getCode() == KeyCode.W) {
            ship.setTranslateY(ship.getTranslateY() - 5);
        }  else if (event.getCode() == KeyCode.S) {
            ship.setTranslateY(ship.getTranslateY() + 5);
        } else if (event.getCode() == KeyCode.A) {
            ship.setTranslateX(ship.getTranslateX() - 5);
        }  else if (event.getCode() == KeyCode.D) {
            ship.setTranslateX(ship.getTranslateX() + 5);
        }
    }

    void keyReleased(KeyEvent event) {
        System.out.println(event.getCode());
    }
}