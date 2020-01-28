package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;

public class LightDistantEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setFont(Font.font(null, FontWeight.BOLD, 35));
		
		text.setX(250);
		text.setY(100);
		
		text.setText("This is JavaFX");
		text.setFill(Color.GREEN);
		
		Image image = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageView = new ImageView(image);
		
		imageView.setX(150);
		imageView.setY(200);
		
		Light.Distant light = new Light.Distant();
		
		light.setAzimuth(0.2);
		light.setColor(Color.YELLOW);
		
		Lighting lighting = new Lighting();
		
		lighting.setLight(light);
		
		text.setEffect(lighting);
		
		imageView.setEffect(lighting);
		
		Group group = new Group();
		
		group.getChildren().addAll(text, imageView);
		
		Scene scene = new Scene(group, 800, 800);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing LightDistant Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
