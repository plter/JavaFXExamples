package sample;

import javafx.event.Event;
import javafx.scene.control.TextField;

public class Controller {


    public TextField tf;

    public void clickHandler(Event event) {
        tf.setText("Hello JavaFX");
    }
}
