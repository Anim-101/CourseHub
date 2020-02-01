package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class LabelUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label label = new Label("This is JavaFX");
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(label);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Label UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
