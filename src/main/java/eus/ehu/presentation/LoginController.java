package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML private TextField userField;
    @FXML private TextField passField;
    @FXML private Label messageLabel;

    @FXML
    private void handleLogin() {
        String user = userField.getText();
        String pass = passField.getText();

        if ("admin".equals(user) && "123456".equals(pass)) {
            messageLabel.setText("Correct!");
            messageLabel.getStyleClass().setAll("lbl", "lbl-success");
        } else {
            messageLabel.setText("Try again :)");
            messageLabel.getStyleClass().setAll("lbl", "lbl-danger");
        }
        messageLabel.setVisible(true);
    }
}