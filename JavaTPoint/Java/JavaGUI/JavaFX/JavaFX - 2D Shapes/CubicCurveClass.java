package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurve;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.Group;


public class CubicCurveClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		CubicCurve cubicCurve = new CubicCurve();
		
		cubicCurve.setStartX(20);
		cubicCurve.setStartY(100);
		cubicCurve.setControlX1(300);
		cubicCurve.setControlX2(200);
		cubicCurve.setControlY1(100);
		cubicCurve.setControlY2(90);
		cubicCurve.setFill(Color.NAVY);
		cubicCurve.setEffect(new DropShadow());
		cubicCurve.setEndX(100);
		cubicCurve.setEndY(300);
		
		Group group = new Group();
		
		group.getChildren().add(cubicCurve);
		
		Scene scene = new Scene(group, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Cubic Curve");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
