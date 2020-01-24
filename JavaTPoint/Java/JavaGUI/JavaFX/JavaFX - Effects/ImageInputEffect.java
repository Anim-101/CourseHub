package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.effect.ImageInput;
import javafx.scene.Group;

public class ImageInputEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image imageImage = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageInput imageInput = new ImageInput();
		
		Rectangle rectangle = new Rectangle();
		
		imageInput.setSource(imageImage);
		imageInput.setX(20);
		imageInput.setY(100);
		
		rectangle.setEffect(imageInput);
		
		Group group = new Group();
		
		group.getChildren().add(rectangle);
		
		Scene scene = new Scene(group, 500, 600, Color.BLACK);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Image Input Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}