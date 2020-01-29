package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

public class Translation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangleOne = new Rectangle(20, 20, 200, 150);
		
		Rectangle rectangleTwo = new Rectangle(20, 20, 200, 150);
		
		rectangleOne.setFill(Color.RED);
		rectangleOne.setStroke(Color.BLACK);
		rectangleOne.setStrokeWidth(5);
		
		rectangleTwo.setFill(Color.GREEN);
		rectangleTwo.setStroke(Color.BLACK);
		rectangleTwo.setStrokeWidth(5);
		
		Translate translate = new Translate();
		
		translate.setX(200);
		translate.setY(200);
		translate.setZ(200);
		
		rectangleTwo.getTransforms().addAll(translate);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangleOne, rectangleTwo);
		
		Scene scene = new Scene(group, 450, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Translation");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
