package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class SepiaToneEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image imageOne = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		Image imageTwo = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageViewOne = new ImageView(imageOne);
		
		ImageView imageViewTwo = new ImageView(imageTwo);
		
		Text textOne = new Text("Original Image");
		
		Text textTwo = new Text("SepiaTone Effect Applied Image");
		
		textOne.setX(100);
		textOne.setY(550);
		
		textTwo.setX(650);
		textTwo.setY(550);
		
		textOne.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textTwo.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textOne.setFill(Color.RED);
		
		textTwo.setFill(Color.RED);
		
		textOne.setStroke(Color.BLACK);
		
		textTwo.setStroke(Color.BLACK);
		
		textOne.setStrokeWidth(0.2);
		
		textTwo.setStrokeWidth(0.2);
		
		imageViewOne.setX(50);
		imageViewOne.setY(40);
		
		imageViewTwo.setX(550);
		imageViewTwo.setY(40);
		
		SepiaTone sepiaTone = new SepiaTone();
		
		sepiaTone.setLevel(0.789);
		
		imageViewTwo.setEffect(sepiaTone);
		
		Group group = new Group();
		
		group.getChildren().addAll(imageViewOne, imageViewTwo, textOne, textTwo);
	
		Scene scene = new Scene(group, 1050, 600);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing SepiaTone Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
