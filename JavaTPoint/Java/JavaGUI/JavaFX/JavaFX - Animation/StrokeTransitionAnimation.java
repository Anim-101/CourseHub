package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.StrokeTransition;

public class StrokeTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle(200, 150, 100);
		
		circle.setStroke(Color.CADETBLUE);
		circle.setFill(Color.RED);
		circle.setStrokeWidth(10);
		
		StrokeTransition strokeTransition = new StrokeTransition();
		
		strokeTransition.setAutoReverse(true);
		
		strokeTransition.setCycleCount(500);
		
		strokeTransition.setDuration(Duration.millis(500));
		
		strokeTransition.setFromValue(Color.BLACK);
		
		strokeTransition.setToValue(Color.PEACHPUFF);
		
		strokeTransition.setShape(circle);
		
		strokeTransition.play();
		
		Group group = new Group();
		
		group.getChildren().addAll(circle);
		
		Scene scene = new Scene(group, 420, 420, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Fill Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
