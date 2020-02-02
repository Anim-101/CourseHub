package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;

public class ProgressIndicatorUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ProgressIndicator progressIndicator = new ProgressIndicator();
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(progressIndicator);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing ProgressBar UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
