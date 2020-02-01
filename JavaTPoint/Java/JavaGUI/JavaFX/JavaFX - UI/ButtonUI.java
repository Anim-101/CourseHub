package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class ButtonUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button button = new Button("Button");
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(button);
		
		Scene scene = new Scene(stackPane, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Button UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
