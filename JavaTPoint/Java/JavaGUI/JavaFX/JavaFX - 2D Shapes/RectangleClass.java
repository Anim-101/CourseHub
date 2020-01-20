package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class RectangleClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(20);
		rectangle.setY(20);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangle);
		
		Scene scene = new Scene(group, 200, 200, Color.GRAY);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Rectangle");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
