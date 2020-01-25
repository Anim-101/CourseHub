package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Bloom;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class BloomEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangleOne = new Rectangle(60, 50, 150, 200);
		Rectangle rectangleTwo = new Rectangle(325, 50, 150, 200);
		
		rectangleOne.setFill(Color.GREEN);
		rectangleOne.setStroke(Color.BLACK);
		rectangleOne.setStrokeWidth(5);
		
		rectangleTwo.setFill(Color.GREEN);
		rectangleTwo.setStroke(Color.BLACK);
		rectangleTwo.setStrokeWidth(5);
		
		Text textOne = new Text("Effected Shape");
		Text textTwo = new Text("Original Shape");
		
		textOne.setX(65);
		textOne.setY(300);
		
		textTwo.setX(335);
		textTwo.setY(300);
		
		textOne.setFont(Font.font("Courier 10 Pitch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textTwo.setFont(Font.font("Courier 10 Pictch", FontWeight.BOLD, FontPosture.REGULAR, 16));
		
		textOne.setFill(Color.RED);
		
		textTwo.setFill(Color.RED);
		
		textOne.setStrokeWidth(0.2);
		
		textTwo.setStrokeWidth(0.2);
		
		Bloom bloom = new Bloom();
		
		bloom.setThreshold(0.1);
		
		rectangleOne.setEffect(bloom);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangleOne, rectangleTwo, textOne, textTwo);
		
		Scene scene = new Scene(group, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Bloom Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}