package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class HBoxPaneLayout extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button buttonOne = new Button("Button One");
		
		Button buttonTwo = new Button("Button Two");
		
		HBox hbox = new HBox();
		
		hbox.getChildren().addAll(buttonOne, buttonTwo);
		
		Scene scene = new Scene(hbox, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing HBox Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
