package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;


public class RGBColor extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(50);
		rectangle.setY(20);
		rectangle.setWidth(100);
		rectangle.setHeight(150);
		
		int redColor = 20;
		int greenColor = 125;
		int blueColor = 10;
		
		rectangle.setFill(Color.rgb(redColor, greenColor, blueColor, 0.63));
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing RGB Color");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
