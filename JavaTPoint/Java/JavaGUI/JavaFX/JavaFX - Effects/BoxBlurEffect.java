
package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.effect.BoxBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class BoxBlurEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hello JavaFX!!");
		
		text.setX(100);
		text.setY(100);
		
		text.setFont(Font.font("Calibri", FontWeight.BLACK, FontPosture.ITALIC, 20));
		
		text.setFill(Color.RED);
		text.setStroke(Color.BLACK);
		text.setUnderline(true);
		
		BoxBlur boxBlur = new BoxBlur();
		
		boxBlur.setHeight(5);
		boxBlur.setWidth(2);
		boxBlur.setIterations(1);
		
		text.setEffect(boxBlur);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing BoxBlur Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
