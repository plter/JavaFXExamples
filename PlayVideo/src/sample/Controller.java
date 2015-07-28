package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    public MediaView mv;
    private MediaPlayer mp;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            mp = new MediaPlayer(new Media(new File("video.mp4").toURI().toURL().toString()));
            mp.setAutoPlay(true);
            mv.setMediaPlayer(mp);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void playBtnClicked(ActionEvent actionEvent) {
        mp.play();
    }

    public void pauseBtnClicked(ActionEvent actionEvent) {
        mp.pause();
    }

    public void stopBtnClicked(ActionEvent actionEvent) {
        mp.stop();
    }
}
