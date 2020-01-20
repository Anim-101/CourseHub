package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class RoundedCornerRectangle extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(20);
		rectangle.setY(20);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setArcHeight(35);
		rectangle.setArcWidth(35);
		rectangle.setFill(Color.RED);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangle);
		
		Scene scene = new Scene(group, 200, 300, Color.GRAY);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Cornered Rectangle");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
