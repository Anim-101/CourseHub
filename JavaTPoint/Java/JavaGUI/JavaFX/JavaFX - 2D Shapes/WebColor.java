package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class WebColor extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.setX(50);
		rectangle.setY(20);
		rectangle.setWidth(200);
		rectangle.setHeight(250);
		rectangle.setEffect(new DropShadow());
		rectangle.setFill(Color.web("#0000FF", 1));
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 300, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Web Color");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
