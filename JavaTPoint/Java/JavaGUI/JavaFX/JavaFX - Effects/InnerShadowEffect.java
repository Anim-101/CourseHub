package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class InnerShadowEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image image  = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageView = new ImageView(image);
		
		imageView.setFitHeight(100);
		imageView.setFitWidth(350);
		
		imageView.setX(100);
		imageView.setY(100);
		
		InnerShadow innerShadow = new InnerShadow();
		
		innerShadow.setBlurType(BlurType.GAUSSIAN);
		innerShadow.setColor(Color.RED);
		innerShadow.setHeight(25);
		innerShadow.setRadius(12);
		innerShadow.setWidth(20);
		innerShadow.setChoke(0.9);
		
		imageView.setEffect(innerShadow);
		
		Group group = new Group();
		
		group.getChildren().add(imageView);
		
		Scene scene = new Scene(group, 550, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shwoing InnerShadow Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
