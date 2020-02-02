package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class HyperLinkUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Hyperlink hyperlink = new Hyperlink("https://www.java.com/en/");
		
		hyperlink.setOnAction(e-> System.out.println("Link Clicked Perfectly"));
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(hyperlink);
		
		Scene scene = new Scene(stackPane, 400, 300, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Hyperlin UI");
		primaryStage.show();		
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
