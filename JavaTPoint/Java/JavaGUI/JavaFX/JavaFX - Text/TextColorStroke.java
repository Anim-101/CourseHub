package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.Group;

public class TextColorStroke extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hola, JavaFX");
		text.setX(150);
		text.setY(150);
		text.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR, 20));
		text.setFill(Color.BLUE);
		text.setStroke(Color.BLACK);
		text.setStrokeWidth(1);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Text Color and Stroke");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
