package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HelloJavaFX extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button button = new Button("HellJavaFX");
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				
				System.out.println("Hello Java Fx");
			}
		});
		
		StackPane root = new StackPane();
		
		root.getChildren().add(button);
		
		Scene scene = new Scene(root, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("First JavaFX Application - HelloJavaFX");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
