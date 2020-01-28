package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class GaussianBlurEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hey Hey Hey !! Java FX.");
		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Calibri", FontWeight.BLACK, FontPosture.ITALIC, 20));
		text.setFill(Color.RED);
		text.setStroke(Color.BLACK);
		text.setUnderline(true);
		
		
		GaussianBlur gaussianBlur = new GaussianBlur();
		
		gaussianBlur.setRadius(5);
		
		text.setEffect(gaussianBlur);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 400, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing GaussianBlur Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
