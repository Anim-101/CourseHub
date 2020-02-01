package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.FadeTransition;

public class FadeTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle(250, 120, 80);
		
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLACK);
		
		FadeTransition fadeTransition = new FadeTransition();
		
		fadeTransition.setDuration(Duration.millis(5000));
		
		fadeTransition.setFromValue(10);
		fadeTransition.setToValue(0.1);
		
		fadeTransition.setCycleCount(1000);
		
		fadeTransition.setAutoReverse(true);
		
		fadeTransition.setNode(circle);
		
		fadeTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(circle);
		
		Scene scene = new Scene(group, 500, 250, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Fade Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
