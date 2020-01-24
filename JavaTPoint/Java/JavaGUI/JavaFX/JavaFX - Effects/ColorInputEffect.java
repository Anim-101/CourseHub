package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorInput;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorInputEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ColorInput colorInput = new ColorInput();
		
		colorInput.setPaint(Color.DARKRED);
		colorInput.setHeight(100);
		colorInput.setWidth(100);
		colorInput.setX(140);
		colorInput.setY(90);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setEffect(colorInput);
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Color Input Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
