package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.animation.RotateTransition;
import javafx.util.Duration;

public class RotateTransitionAnimation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle(200, 100, 200, 200);
		
		rectangle.setFill(Color.LIMEGREEN);
		rectangle.setStroke(Color.BLACK);
		rectangle.setStrokeWidth(5);
		
		RotateTransition rotate = new RotateTransition();
		
		rotate.setAxis(Rotate.Z_AXIS);
		
		rotate.setByAngle(360);
		
		rotate.setCycleCount(500);
		
		rotate.setDuration(Duration.millis(1000));
		
		rotate.setAutoReverse(true);
		
		rotate.setNode(rectangle);
		
		rotate.play();
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 600, 400, Color.CORNSILK);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Roate Transition Animation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
