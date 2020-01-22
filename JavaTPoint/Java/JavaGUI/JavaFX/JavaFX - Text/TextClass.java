package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;

public class TextClass extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Text text = new Text();
		
		text.setText("Hello, World. This is First Text from JavaFX");
		
		StackPane root = new StackPane();
		
		root.getChildren().add(text);
		
		Scene scene = new Scene(root, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Text");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
