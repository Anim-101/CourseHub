package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;

public class EventHandlers extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle(100, 100, 50);
		
		circle.setFill(Color.GREEN);
		circle.setStroke(Color.BLACK);
		
		Button playButton = new Button("Play");
		
		Button pauseButton = new Button("Pause");
		
		playButton.setTranslateX(125);
		playButton.setTranslateY(200);
		
		pauseButton.setTranslateX(175);
		pauseButton.setTranslateY(200);
		
		TranslateTransition translateTransition = new TranslateTransition();
		
		translateTransition.setAutoReverse(true);
		translateTransition.setByX(200);
		translateTransition.setCycleCount(100);
		translateTransition.setDuration(Duration.millis(500));
		translateTransition.setNode(circle);
		
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent> () {
			
			public void handle(MouseEvent event) {
				
				if(event.getSource() == playButton) {
					
					translateTransition.play();
				}
				
				if(event.getSource() == pauseButton) {
					
					translateTransition.pause();
				}
				
				event.consume();
			}
		};
		
		playButton.setOnMouseClicked(handler);
		
		pauseButton.setOnMouseClicked(handler);
		
		Group group = new Group();
		
		group.getChildren().addAll(circle, playButton, pauseButton);
		
		Scene scene = new Scene(group, 420, 300, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Event Handlers");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
