package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class ShadowEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image image = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageView = new ImageView(image);
		
		imageView.setFitHeight(200);
		imageView.setFitWidth(450);
		
		imageView.setX(100);
		imageView.setY(100);
		
		Shadow shadow = new Shadow();
		
		shadow.setBlurType(BlurType.GAUSSIAN);
		shadow.setColor(Color.BLACK);
		
		shadow.setHeight(30);
		shadow.setRadius(12);
		shadow.setWidth(20);
		
		imageView.setEffect(shadow);
		
		Group group = new Group();
		
		group.getChildren().add(imageView);
		
		Scene scene = new Scene(group, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Shadow Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
