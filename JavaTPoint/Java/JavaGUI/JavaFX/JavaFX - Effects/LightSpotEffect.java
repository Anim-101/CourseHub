package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;

public class LightSpotEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setFont(Font.font(null, FontWeight.BOLD, 35));
		
		text.setX(20);
		text.setY(50);
		
		text.setTextOrigin(VPos.TOP);
		text.setText("Hey! Hey! Hey! JavaFX!!");
		text.setFill(Color.GREEN);
		
		Light.Spot light = new Light.Spot();
				
		light.setPointsAtX(0);
		light.setPointsAtY(0);
		light.setPointsAtZ(-50);
		light.setSpecularExponent(5);
		
		Lighting lighting = new Lighting();
		
		text.setEffect(lighting);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 450, 150);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing LightSpot Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}