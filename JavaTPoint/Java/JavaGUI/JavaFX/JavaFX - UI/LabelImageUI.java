package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

import java.io.FileInputStream;

public class LabelImageUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		FileInputStream input = new FileInputStream("D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - UI/java.jpg");
	
		Image image = new Image(input);
		
		ImageView imageView = new ImageView(image);
		
		Label label = new Label("Java", imageView);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(label);
		
		Scene scene = new Scene(stackPane, 500, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Label UI with Image");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
