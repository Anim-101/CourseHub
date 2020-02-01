package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
import javafx.animation.FillTransition;

public class FillTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Polygon polygon = new Polygon();
		
		polygon.getPoints().addAll(new Double[] {220.0, 270.0, 170.0, 220.0, 170.0, 120.0, 220.0, 70.0, 270.0, 120.0, 270.0, 220.0});
	
		polygon.setStroke(Color.BLACK);
		
		FillTransition fillTransition = new FillTransition();
		
		fillTransition.setAutoReverse(true);
		
		fillTransition.setCycleCount(50);
		
		fillTransition.setDuration(Duration.millis(1000));
		
		fillTransition.setFromValue(Color.BLACK);
		
		fillTransition.setToValue(Color.WHITESMOKE);
		
		fillTransition.setShape(polygon);
		
		fillTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(polygon);
		
		Scene scene = new Scene(group, 420, 420, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Fill Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
