package org.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private CheckBox cbBy3;

    @FXML
    private CheckBox cbBy5;

    @FXML
    private TextField tfNumber;

    @FXML
    void onTestButtonClick(ActionEvent event) {
        int number = Integer.parseInt(tfNumber.getText());
        cbBy3.setSelected(false);
        cbBy5.setSelected(false);
        if (number % 3 == 0) {
            cbBy3.setSelected(true);
        }
        if (number % 5 == 0) {
            cbBy5.setSelected(true);
        }
    }

}
