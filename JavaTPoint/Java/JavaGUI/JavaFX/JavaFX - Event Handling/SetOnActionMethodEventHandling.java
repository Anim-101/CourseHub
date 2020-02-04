package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.animation.RotateTransition;

public class SetOnActionMethodEventHandling extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle(100, 100, 120, 120);
		
		rectangle.setFill(Color.BEIGE);
		rectangle.setStroke(Color.BURLYWOOD);
		
		RotateTransition rotate = new RotateTransition();
		
		rotate.setAutoReverse(false);
		rotate.setByAngle(360);
		rotate.setCycleCount(500);
		rotate.setDuration(Duration.millis(500));
		rotate.setNode(rectangle);
		
		Button buttonPlay = new Button();
		
		buttonPlay.setText("Play");
		
		buttonPlay.setTranslateX(100);
		buttonPlay.setTranslateY(250);
		
		buttonPlay.setOnAction(new EventHandler<ActionEvent> () {
			
			public void handle(ActionEvent arg0) {
				
				rotate.play();
			}
		});
		
		Button buttonPause = new Button();
		
		buttonPause.setText("Pause");
		
		buttonPause.setTranslateX(160);
		buttonPause.setTranslateY(250);
		
		buttonPause.setOnAction(new EventHandler<ActionEvent> () {
			
			public void handle(ActionEvent args) {
				
				rotate.pause();
			}
		});
		
		Group group = new Group();
		
		group.getChildren().addAll(buttonPlay, rectangle, buttonPause);
		
		Scene scene = new Scene(group, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing SetOnAction Method & Event Handling");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
