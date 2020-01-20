package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;

public class PolygonClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Polygon polygon = new Polygon();
		
		polygon.getPoints().addAll( new Double [] {
			
				0.0, 0.0,
				100.0, 200.0,
				200.0, 100.0
		});
		
		Group group = new Group();
		
		group.getChildren().add(polygon);
		
		Scene scene = new Scene(group, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Polygon");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}

}
