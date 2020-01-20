package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class RadialGradientClass extends Application {
	
	public void start(final Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Showing Radial Gradient");
		
		Group root = new Group();
		
		Scene scene = new Scene(root, 400, 400, Color.WHITE);
		
		primaryStage.setScene(scene);
		
		addRectangle(scene);
		
		primaryStage.show();
	}
	
	private void addRectangle(final Scene scene) {
		
		Circle circle = new Circle(200, 150, 100);
		
		RadialGradient radialGradient = new RadialGradient(0,
				.1,
				100,
				100,
				200,
				false,
				CycleMethod.NO_CYCLE,
				new Stop(0, Color.YELLOW),
				new Stop(1, Color.RED));
		
		circle.setFill(radialGradient);
		
		final Group root = (Group) scene.getRoot();
		
		root.getChildren().add(circle);
	}
	
	public static void main(String [] args) {
		
		Application.launch(args);
	}
}