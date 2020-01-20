package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class ArcClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Arc arc = new Arc();
		
		arc.setCenterX(100);
		arc.setCenterY(100);
		arc.setRadiusX(50);
		arc.setRadiusY(80);
		arc.setStartAngle(30);
		arc.setLength(100);
		arc.setType(ArcType.ROUND);
		arc.setFill(Color.BLUE);
		
		Group group = new Group();
		
		group.getChildren().addAll(arc);
		
		Scene scene = new Scene(group, 200, 300, Color.GRAY);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Arc");
		primaryStage.show();
	}

	public static void main(String [] args) {
		
		launch(args);
	}
}
