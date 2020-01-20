package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;

public class EllipseClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Ellipse ellipse = new Ellipse();
		
		ellipse.setCenterX(100);
		ellipse.setCenterY(100);
		ellipse.setRadiusX(50);
		ellipse.setRadiusY(80);
		
		Group group = new Group();
		
		group.getChildren().addAll(ellipse);
		
		Scene scene = new Scene(group, 200, 300, Color.RED);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Ellipse");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
