package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Polygon;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;

public class SequentialTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Polygon polygon = new Polygon();
		
		polygon.getPoints().addAll(new Double[] {320.0, 270.0, 270.0, 220.0, 270.0, 270.0, 320.0, 120.0, 370.0, 270.0, 370.0, 220.0});
		
		polygon.setFill(Color.LIMEGREEN);
		polygon.setStroke(Color.BLACK);
		
		Duration durationFirst = Duration.millis(1000);
		
		Duration durationSecond = Duration.millis(500);
		
		PauseTransition pauseTransition = new PauseTransition(Duration.millis(1000));
		
		FadeTransition fadeTransition = new FadeTransition(durationSecond);
		
		fadeTransition.setFromValue(1.0f);
		fadeTransition.setToValue(0.3f);
		fadeTransition.setCycleCount(2);
		fadeTransition.setAutoReverse(true);
		
		TranslateTransition translateTransition = new TranslateTransition(durationFirst);
		
		translateTransition.setToX(-150f);
		translateTransition.setCycleCount(2);
		translateTransition.setAutoReverse(true);
		
		RotateTransition rotateTransition = new RotateTransition(durationSecond);
		
		rotateTransition.setByAngle(180f);
		rotateTransition.setCycleCount(4);
		rotateTransition.setAutoReverse(true);
		
		ScaleTransition scaleTransition = new ScaleTransition(durationFirst);
		
		scaleTransition.setByX(1.5f);
		scaleTransition.setByY(1.2f);
		scaleTransition.setCycleCount(2);
		scaleTransition.setAutoReverse(true);
		
		SequentialTransition sequentialTransition = new SequentialTransition(polygon, rotateTransition, pauseTransition, fadeTransition, translateTransition, scaleTransition);
		
		sequentialTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(polygon);
		
		Scene scene = new Scene(group, 450, 450, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Sequential Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
 }
