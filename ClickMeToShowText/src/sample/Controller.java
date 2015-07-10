package sample;

import javafx.event.Event;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller {


    public void setView(Parent root) {
        view = root;
    }

    private Parent view = null;

    public void clickHandler(Event event) {
        TextField tf = (TextField) view.lookup("#tf");
        tf.setText("Hello JavaFX");
    }
}
