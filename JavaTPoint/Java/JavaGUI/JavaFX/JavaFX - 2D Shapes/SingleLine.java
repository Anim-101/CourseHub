package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.scene.Scene;

public class SingleLine extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Line line = new Line();
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(100);
		line.setEndY(200);
		
		Group root = new Group();
		
		root.getChildren().add(line);
		
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Constructing Line");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}