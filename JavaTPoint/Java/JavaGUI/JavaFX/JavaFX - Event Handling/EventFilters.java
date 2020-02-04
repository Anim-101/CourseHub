package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class EventFilters extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label labelOne = new Label("Press Any Key");
		
		Label labelTwo = new Label("Filtering Event");
		
		labelOne.setTranslateX(100);
		labelOne.setTranslateY(100);
		
		labelTwo.setTranslateX(100);
		labelTwo.setTranslateY(150);
		
		TextField textFieldOne = new TextField();
		
		TextField textFieldTwo = new TextField();
		
		textFieldOne.setTranslateX(250);
		textFieldOne.setTranslateY(100);
		
		textFieldTwo.setTranslateX(250);
		textFieldTwo.setTranslateY(150);
		
		EventHandler<KeyEvent> filter = new EventHandler<KeyEvent> () {
			
			public void handle(KeyEvent event) {
				
				textFieldTwo.setText("Event: " + event.getEventType());
				
				textFieldOne.setText(event.getText());
				
				event.consume();
			}
		};
		
		textFieldOne.addEventFilter(KeyEvent.ANY, filter);
		
		Group group = new Group();
		
		group.getChildren().addAll(labelOne, labelTwo, textFieldOne, textFieldTwo);
		
		Scene scene = new Scene(group, 500, 300, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Event Filter Event Handling");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
