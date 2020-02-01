package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.FileInputStream;

public class ButtonUIEffect extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		FileInputStream input = new FileInputStream("D://Codebit//CourseHub//JavaTPoint//Java//JavaGUI//JavaFX//JavaFX - UI/java.jpg");
		
		Image image = new Image(input);
		
		ImageView imageView = new ImageView(image);
		
		DropShadow dropShadow = new DropShadow();
		
		Button button = new Button();
		
		button.setEffect(dropShadow);
		
		button.setGraphic(imageView);
		
		button.setWrapText(true);
		
		button.setOnAction(new EventHandler<ActionEvent> () {
			
			public void handle(ActionEvent arg0) {
				
				System.out.println("Hey, This is JavaFX!!");
				
			}
		});
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(button);
		
		Scene scene = new Scene(stackPane, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Button UI Effect");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
