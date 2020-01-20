package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;

public class ColorName extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(50);
		rectangle.setY(20);
		rectangle.setWidth(100);
		rectangle.setHeight(150);
		rectangle.setFill(Color.RED);
		rectangle.setEffect(new DropShadow());
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Color by Name");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
