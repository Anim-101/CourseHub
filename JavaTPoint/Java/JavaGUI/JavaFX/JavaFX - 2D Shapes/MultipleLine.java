package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class MultipleLine extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Line lineOne = new Line(10, 50, 150, 50);
		Line lineTwo = new Line(10, 100, 150, 100);
		Line lineThree = new Line(10, 50, 10, 100);
		Line lineFour = new Line(150, 50, 150, 100);
		
		Group root = new Group();
		
		root.getChildren().addAll(lineOne, lineTwo, lineThree, lineFour);
		
		Scene scene = new Scene(root, 400, 400, Color.GREEN);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Multiple Lines");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
