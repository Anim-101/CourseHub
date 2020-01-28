package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.MotionBlur;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class MotionBlurEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text("Welcome JavaFX");
		
		text.setX(50);
		text.setY(100);
		
		text.setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.ITALIC, 44));
	
		MotionBlur motionBlur = new MotionBlur();
		
		motionBlur.setAngle(20);
		motionBlur.setRadius(10);
		
		text.setEffect(motionBlur);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 500, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shwoing MotionBlur Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
