package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;

public class StackPaneLayout extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		Button buttonOne = new Button("Button One");
		
		Button buttonTwo = new Button("Button Two");
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().addAll(buttonOne, buttonTwo);
		
		Scene scene = new Scene(stackPane, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing StackPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
