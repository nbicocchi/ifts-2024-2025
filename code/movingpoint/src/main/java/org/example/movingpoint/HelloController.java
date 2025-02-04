package org.example.movingpoint;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

public class HelloController {
    AnimationTimer timer;

    @FXML
    private ImageView ship;
    private Vector2D shipSpeed = new Vector2D(0, 0);


    public void initialize() {
        if (timer != null) {
            timer.stop();
        }
        timer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                mainLoop();
            }
        };
        timer.start();
    }

    private void mainLoop() {
        ship.setTranslateX(ship.getTranslateX() + shipSpeed.getX());
        ship.setTranslateY(ship.getTranslateY() + shipSpeed.getY());
    }

    void keyPressed(KeyEvent event) {
        System.out.println(event.getCode());

        if (event.getCode() == KeyCode.W) {
            shipSpeed = new Vector2D(0, -0.1);
        }  else if (event.getCode() == KeyCode.S) {
            shipSpeed = new Vector2D(0, 0.1);
        } else if (event.getCode() == KeyCode.A) {
            shipSpeed = new Vector2D(-0.1, 0);
        }  else if (event.getCode() == KeyCode.D) {
            shipSpeed = new Vector2D(0.1, 0);
        }
    }

    void keyReleased(KeyEvent event) {
        System.out.println(event.getCode());
    }
}