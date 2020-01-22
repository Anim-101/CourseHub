package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TextFont extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hello, JavaFX");
		text.setX(200);
		text.setY(100);
		text.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR, 20));
		
		Group group = new Group();
		
		group.getChildren().add(text);
		
		Scene scene = new Scene(group, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Text Font");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
