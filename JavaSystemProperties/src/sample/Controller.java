package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Controller implements Initializable {
    public TextArea taOutput;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Properties properties = System.getProperties();
        Set<String> keys = properties.stringPropertyNames();
        for (String key :
                keys) {
            taOutput.appendText(key + "  :  " + properties.getProperty(key) + "\n");
        }
    }
}
