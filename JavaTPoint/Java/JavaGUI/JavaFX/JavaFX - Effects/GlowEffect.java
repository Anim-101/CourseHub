package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class GlowEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image imageOne = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		Image imageTwo = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageViewOne = new ImageView(imageOne);
		ImageView imageViewTwo = new ImageView(imageTwo);
		
		Text textOne = new Text();
		Text textTwo = new Text();
		
		textOne.setText("Glowing with Level 10");
		textTwo.setText("Not Glowing");
		
		textOne.setX(155);
		textOne.setY(650);
		
		textTwo.setX(755);
		textTwo.setY(650);
		
		textOne.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		textTwo.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textOne.setFill(Color.RED);
		textTwo.setFill(Color.RED);
		
		textOne.setStroke(Color.BLACK);
		textTwo.setStroke(Color.BLACK);
		
		imageViewOne.setX(70);
		imageViewOne.setY(90);
		
		imageViewTwo.setX(550);
		imageViewTwo.setY(90);
		
		Glow glow = new Glow();
		
		glow.setLevel(10);
		
		imageViewOne.setEffect(glow);
		
		Group group = new Group();
		
		group.getChildren().addAll(imageViewOne, imageViewTwo, textOne, textTwo);
		
		Scene scene = new Scene (group, 1100, 700);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Glow Effect");
		primaryStage.show();
	}
	
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
