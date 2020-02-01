package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.SequentialTransition;

public class PauseTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Polygon polygon = new Polygon();
		
		polygon.getPoints().addAll(new Double [] {320.0, 270.0, 270.0, 220.0, 270.0, 270.0, 320.0, 120.0, 370.0, 270.0, 370.0, 220.0});
		
		polygon.setFill(Color.LIMEGREEN);
		polygon.setStroke(Color.BLACK);
		
		RotateTransition rotateTransition = new RotateTransition(Duration.millis(500), polygon);
		
		rotateTransition.setByAngle(180);
		rotateTransition.setCycleCount(2);
		rotateTransition.setAutoReverse(true);
		
		TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500), polygon);
		
		translateTransition.setToX(-150f);
		translateTransition.setCycleCount(2);
		translateTransition.setAutoReverse(true);
		
		FadeTransition fadeTransition = new FadeTransition(Duration.millis(500), polygon);
		
		fadeTransition.setFromValue(1.0f);
		fadeTransition.setToValue(0.5f);
		fadeTransition.setCycleCount(2);
		fadeTransition.setAutoReverse(true);
		
		SequentialTransition sequentialTransition = new SequentialTransition(fadeTransition, new PauseTransition(Duration.millis(2000)), rotateTransition, new PauseTransition(Duration.millis(2000)), translateTransition );
	
		sequentialTransition.play();
		
		Group group = new Group();
		
		group.getChildren().addAll(polygon);
		
		Scene scene = new Scene(group, 500, 300, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Puase Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
