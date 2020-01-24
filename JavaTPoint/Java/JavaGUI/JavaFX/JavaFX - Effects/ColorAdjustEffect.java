package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class ColorAdjustEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Image imageOne = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		Image imageTwo = new Image("https://avatars0.githubusercontent.com/u/22726768?s=460&v=4");
		
		ImageView imageViewOne = new ImageView(imageOne);
		ImageView imageViewTwo = new ImageView(imageTwo);
		
		Text textOne = new Text();
		Text textTwo = new Text();
		
		textOne.setText("Color Adjust Effect Applied");
		textTwo.setText("Color Ajust Effect Not Applied");
		
		textOne.setX(200);
		textOne.setY(600);
		
		textTwo.setX(655);
		textTwo.setY(600);
		
		textOne.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		textTwo.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textOne.setFill(Color.RED);
		textTwo.setFill(Color.BLUE);
		
		textOne.setStroke(Color.BLACK);
		textTwo.setStroke(Color.BLACK);
		
		textOne.setStrokeWidth(0.2);
		textTwo.setStrokeWidth(0.2);
		
		imageViewOne.setX(100);
		imageViewOne.setY(90);
		imageViewTwo.setX(500);
		imageViewTwo.setY(90);
		
		ColorAdjust colorAdjust = new ColorAdjust();
		
		colorAdjust.setBrightness(0.2);
		colorAdjust.setContrast(0.1);
		colorAdjust.setHue(0.3);
		colorAdjust.setSaturation(0.45);
		
		imageViewOne.setEffect(colorAdjust);
		
		Group group = new Group();
		
		group.getChildren().addAll(imageViewOne, imageViewTwo, textOne, textTwo);
		
		Scene scene = new Scene(group, 1050, 700);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Color Adjust Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
