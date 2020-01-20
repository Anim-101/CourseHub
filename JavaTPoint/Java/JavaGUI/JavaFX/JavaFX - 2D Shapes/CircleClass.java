package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class CircleClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle();
		
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(100);
		circle.setFill(Color.GREEN);
		
		Group group = new Group();
		
		group.getChildren().addAll(circle);
		
		Scene scene = new Scene(group, 400, 500, Color.DARKGRAY);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Circle");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
