package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;

public class HBoxPaneLayoutSpaceAmongNodes extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button buttonOne = new Button("Button One");
		
		Button buttonTwo = new Button("Button Two");
		
		HBox hbox = new HBox();
		
		hbox.getChildren().addAll(buttonOne, buttonTwo);
		
		hbox.setSpacing(40);
		
		Scene scene = new Scene(hbox, 200, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Spaced Among Nodes in ButtonPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
