package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.util.UUID;

public class Controller {
    public TextArea taUUIDOut;

    public void btnCreateUUIDClickedHandler(ActionEvent actionEvent) {
        taUUIDOut.setText(UUID.randomUUID().toString());
    }
}
