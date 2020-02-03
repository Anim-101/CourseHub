package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class VideoMedia extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		String path = "D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - Media/Kisu shite hoshii - The Blue Hearts.mp4";
	
		Media media = new Media(new File(path).toURI().toString());
	
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		MediaView mediaView = new MediaView(mediaPlayer);
		
		mediaPlayer.setAutoPlay(true);
		
		Group group = new Group();
		
		group.getChildren().add(mediaView);
		
		Scene scene = new Scene(group, 500, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Video Media");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
