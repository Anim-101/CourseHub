package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ProgressBar;

public class ProgressBarUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ProgressBar progressBar = new ProgressBar();
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(progressBar);
		
		Scene scene = new Scene(stackPane, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing ProgressBar UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
