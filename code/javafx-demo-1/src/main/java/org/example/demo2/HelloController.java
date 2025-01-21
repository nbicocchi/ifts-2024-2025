package org.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
  @FXML private TextField tfV1;
  @FXML private TextField tfV2;
  @FXML private TextField tfV3;
  @FXML private TextField tfResult;

  @FXML
  protected void onProcessButtonClick() {
    double v1 = Double.parseDouble(tfV1.getText());
    double v2 = Double.parseDouble(tfV2.getText());
    double v3 = Double.parseDouble(tfV3.getText());
    double result = v1 + v2 + v3;
    tfResult.setText(Double.toString(result));
  }
}