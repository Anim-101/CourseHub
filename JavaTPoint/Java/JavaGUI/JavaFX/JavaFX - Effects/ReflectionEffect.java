package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class ReflectionEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hello from JavaFX");
		
		text.setX(100);
		text.setY(100);
		
		text.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.REGULAR, 30));
		
		Reflection reflection = new Reflection();
		
		reflection.setBottomOpacity(0.2);
		reflection.setFraction(12);
		reflection.setTopOffset(10);
		reflection.setTopOpacity(0.2);
		
		text.setEffect(reflection);
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Reflection Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
