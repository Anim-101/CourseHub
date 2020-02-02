package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;

public class HyperLinkUIImage extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Hyperlink hyperlink = new Hyperlink("https://www.java.com/en/");
		
		hyperlink.setOnAction(e->System.out.println("Link Clicked Perfectly"));
		
		FileInputStream input = new FileInputStream("D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - UI/java.jpg");
		
		Image image = new Image(input);
		
		ImageView imageView = new ImageView(image);
		
		hyperlink.setGraphic(imageView);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(hyperlink);
		
		Scene scene = new Scene(stackPane, 600, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Hyperlink UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
