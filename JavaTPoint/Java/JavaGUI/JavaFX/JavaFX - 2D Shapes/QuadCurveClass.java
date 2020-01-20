package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.QuadCurve;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;

public class QuadCurveClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		QuadCurve quadCurve = new QuadCurve();
		
		quadCurve.setStartX(70);
		quadCurve.setStartY(30);
		quadCurve.setControlX(250);
		quadCurve.setControlY(50);
		quadCurve.setFill(Color.BLUE);
		quadCurve.setEffect(new DropShadow());
		quadCurve.setEndX(250);
		quadCurve.setEndY(300);
		
		
		Group group = new Group();
		
		group.getChildren().add(quadCurve);
		
		Scene scene = new Scene(group, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Quad Curve");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
