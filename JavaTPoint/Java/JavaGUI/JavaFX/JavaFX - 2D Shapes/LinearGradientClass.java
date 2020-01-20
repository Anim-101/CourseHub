package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.LinearGradient;

public class LinearGradientClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Stop [] stopLinearGradient = new Stop[] {new Stop(0, Color.GREEN), new Stop(1, Color.BLUE)};
		
		LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stopLinearGradient);
		
		Rectangle rectangle = new Rectangle(0, 0, 100, 100);
		
		rectangle.setFill(linearGradient);
		
		VBox root = new VBox();
		
		root.getChildren().add(rectangle);
		
		final Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Linear Gradient");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}