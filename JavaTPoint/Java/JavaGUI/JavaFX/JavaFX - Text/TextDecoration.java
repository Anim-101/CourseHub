package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.Group;

public class TextDecoration extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Decorations of Text");
		text.setX(100);
		text.setY(100);
		text.setFont(Font.font("Liberation Serif", 25));
		text.setStrikethrough(true);
		text.setUnderline(true);
		
		Group group = new Group();
		
		Scene scene = new Scene(group, 500, 500);
		
		group.getChildren().add(text);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Decorations of Text");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
