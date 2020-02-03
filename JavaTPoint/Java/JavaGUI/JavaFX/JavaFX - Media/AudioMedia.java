package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class AudioMedia extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		String path = "D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - Media/Haikyuu!! OST - Goal.mp3";
		
		Media media = new Media(new File(path).toURI().toString());
		
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		mediaPlayer.play();
		
		primaryStage.setTitle("Playing Audio");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
