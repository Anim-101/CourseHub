package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Rotation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangleOne = new Rectangle(100, 100, 200, 200);
		
		Rectangle rectangleTwo = new Rectangle(100, 100, 200, 200);
		
		rectangleOne.setFill(Color.LIME);
		rectangleOne.setStroke(Color.BLACK);
		
		rectangleTwo.setFill(Color.DARKGREY);
		rectangleTwo.setStroke(Color.BLACK);
		
		Rotate rotate = new Rotate();
		
		rotate.setAngle(30);
		rotate.setPivotX(100);
		rotate.setPivotY(300);
		
		rectangleTwo.getTransforms().add(rotate);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangleOne, rectangleTwo);
		
		Scene scene = new Scene(group, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Rotation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
