package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;

public class TranslateTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle(30, 60, 90);
		
		circle.setCenterX(100);
		circle.setCenterY(100);
		
		circle.setFill(Color.BROWN);
		circle.setStroke(Color.BLACK);
		
		TranslateTransition translateTransition = new TranslateTransition();
		
		translateTransition.setByX(500);
		
		translateTransition.setDuration(Duration.millis(1000));
		
		translateTransition.setCycleCount(500);
		
		translateTransition.setAutoReverse(true);
		
		translateTransition.setNode(circle);
		
		translateTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(circle);
		
		Scene scene = new Scene(group, 700, 200, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Translate Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
