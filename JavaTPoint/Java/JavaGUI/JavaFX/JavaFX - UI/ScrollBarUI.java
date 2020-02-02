package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.StackPane;

public class ScrollBarUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ScrollBar scrollBar = new ScrollBar();
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(scrollBar);
		
		Scene scene = new Scene(stackPane, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Scrollbar UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
