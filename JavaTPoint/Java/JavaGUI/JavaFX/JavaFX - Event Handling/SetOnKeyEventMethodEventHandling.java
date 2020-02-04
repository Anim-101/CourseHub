package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class SetOnKeyEventMethodEventHandling extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		TextField textFieldOne = new TextField();
		
		TextField textFieldTwo = new TextField();
		
		textFieldOne.setTranslateX(100);
		textFieldOne.setTranslateY(100);
		
		textFieldTwo.setTranslateX(300);
		textFieldTwo.setTranslateY(100);
		
		textFieldOne.setOnKeyPressed(new EventHandler<KeyEvent> () {
			
			public void handle(KeyEvent key) {
				
				textFieldTwo.setText("Key Pressed: " + "" + key.getText() );
			}
		});
		
		Group group = new Group();
		
		group.getChildren().addAll(textFieldOne, textFieldTwo);
		
		Scene scene = new Scene(group, 500, 200, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing SetOnKey Method Event Handling");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
