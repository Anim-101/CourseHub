package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class DropShadowEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image image = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageView = new ImageView(image);
		
		imageView.setX(130);
		imageView.setY(125);
		
		imageView.setFitWidth(175);
		
		DropShadow dropShadow = new DropShadow();
		
		dropShadow.setBlurType(BlurType.GAUSSIAN);
		dropShadow.setColor(Color.BLACK);
		dropShadow.setHeight(100);
		dropShadow.setWidth(150);
		dropShadow.setOffsetX(10);
		dropShadow.setOffsetY(10);
		dropShadow.setSpread(0.2);
		dropShadow.setRadius(10);
		
		imageView.setEffect(dropShadow);
		
		Group group = new Group();
		
		group.getChildren().add(imageView);
		
		Scene scene = new Scene(group, 500, 700);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing DropShadow Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
