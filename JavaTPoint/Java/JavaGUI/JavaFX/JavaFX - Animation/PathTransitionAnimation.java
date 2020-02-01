package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;

public class PathTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Polygon polygon = new Polygon();
		
		polygon.getPoints().addAll(new Double [] {320.0, 270.0, 270.0, 220.0, 270.0, 270.0, 320.0, 120.0, 370.0, 270.0, 370.0, 220.0});
	
		polygon.setFill(Color.LIME);
		polygon.setStroke(Color.BLACK);
		
		Path path = new Path();
		
		path.getElements().add(new MoveTo(150f, 70f));
		path.getElements().add(new CubicCurveTo(240f, 230f, 500f, 340f, 600f, 50f));
		
		PathTransition pathTransition = new PathTransition();
		
		pathTransition.setDuration(Duration.millis(1000));
		
		pathTransition.setNode(polygon);
		
		pathTransition.setPath(path);
		
		pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
		
		pathTransition.setCycleCount(10);
		
		pathTransition.setAutoReverse(true);
		
		pathTransition.play();
		
		Group group = new Group();
		
		group.getChildren().add(polygon);
		
		Scene scene = new Scene(group, 700, 350, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("SHowing Path Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
