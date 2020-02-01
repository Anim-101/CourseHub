package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.ScaleTransition;

public class ScaleTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle();
		
		circle.setCenterX(300.0f);
		circle.setCenterY(135.0f);
		circle.setRadius(50.0f);
		
		circle.setFill(Color.SADDLEBROWN);
		
		circle.setStrokeWidth(20);
		
		ScaleTransition scaleTransition = new ScaleTransition();
		
		scaleTransition.setDuration(Duration.millis(1000));
		
		scaleTransition.setNode(circle);
		
		scaleTransition.setByX(1.5);
		scaleTransition.setByY(1.5);
		
		scaleTransition.setCycleCount(50);
		
		scaleTransition.setAutoReverse(false);
		
		scaleTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(circle);
		
		Scene scene = new Scene(group, 600, 270);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Scale Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}