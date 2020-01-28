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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class LightPointEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setFont(Font.font(null, FontWeight.BOLD, 40));
		
		text.setX(50);
		text.setY(40);
		
		text.setTextOrigin(VPos.TOP);
		text.setText("Bye! Bye! JavaFX-Effect!!");
		text.setFill(Color.GREEN);
		
		Light.Point light = new Light.Point();
		
		light.setX(0);
		light.setY(0);
		light.setZ(-100);
		
		Lighting lighting = new Lighting();
		
		lighting.setSurfaceScale(5);
		
		text.setEffect(lighting);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 550, 150);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing LightPoint Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
