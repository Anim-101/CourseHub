package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.Scene;

public class HSBColor extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(50);
		rectangle.setY(20);
		rectangle.setWidth(200);
		rectangle.setHeight(250);
		rectangle.setEffect(new DropShadow());
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 400, 400, Color.hsb(180,  1,  1));
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing HSB Color");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
