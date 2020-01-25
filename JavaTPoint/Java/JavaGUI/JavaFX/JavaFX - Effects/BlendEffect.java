package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;

public class BlendEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circle = new Circle(150, 200, 120);
		
		circle.setFill(Color.RED);
		
		Blend blend = new Blend();
		
		ColorInput colorInput = new ColorInput(70, 20, 160, 150, Color.LIMEGREEN);
		
		blend.setTopInput(colorInput);
		blend.setMode(BlendMode.ADD);
		
		circle.setEffect(blend);
		
		Group group = new Group(circle);
		
		Scene scene = new Scene(group, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Blend Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
