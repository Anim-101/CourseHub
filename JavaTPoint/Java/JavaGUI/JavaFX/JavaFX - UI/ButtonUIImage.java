package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;

public class ButtonUIImage extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		FileInputStream input = new FileInputStream("D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - UI/java.jpg");
		
		Image image = new Image(input);
		
		ImageView imageView = new ImageView(image);
		
		Button button = new Button();
		
		button.setGraphic(imageView);
		
		button.setWrapText(true);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(button);
		
		Scene scene = new Scene(stackPane, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Button with Image UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
