package sample;

import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    public WebView wv;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        wv.getEngine().load("http://plter.com");
    }
}
