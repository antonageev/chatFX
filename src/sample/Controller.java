package sample;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;


public class Controller {
    @FXML
    TextArea mainArea;

    @FXML
    TextField msgField;

    @FXML
    Button btnSend;

    public void sendMessageAction(ActionEvent actionEvent) {
        if (msgField.getText().trim().length() > 0) {
            mainArea.appendText(msgField.getText() + "\n");
            msgField.clear();
        }
        msgField.requestFocus();
        checkButton(btnSend);
    }

    public void btnChange(KeyEvent keyEvent) {
        checkButton(btnSend);
    }

    public void checkButton(Button button){
        if (msgField.getText().trim().length() == 0){
            btnSend.setDisable(true);
        }
        else btnSend.setDisable(false);
    }
}
