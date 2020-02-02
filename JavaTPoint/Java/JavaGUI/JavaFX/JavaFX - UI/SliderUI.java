package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Slider;

public class SliderUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Slider slider = new Slider(1, 100, 20);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(slider);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Slider UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
