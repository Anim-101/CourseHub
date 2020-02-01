package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class VBoxPaneLayout extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button buttonOne = new Button("Button One");
		
		Button buttonTwo = new Button("Button Two");
		
		VBox vbox = new VBox();
		
		vbox.getChildren().addAll(buttonOne, buttonTwo);
		
		Scene scene = new Scene(vbox, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing VBoxPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
