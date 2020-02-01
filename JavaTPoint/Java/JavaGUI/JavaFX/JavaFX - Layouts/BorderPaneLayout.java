package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BorderPaneLayout extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane borderPane = new BorderPane();
		
		borderPane.setTop(new Label("This is Top"));
		borderPane.setBottom(new Label("This is Bottom"));
		borderPane.setLeft(new Label("This is Left"));
		borderPane.setRight(new Label("This is Right"));
		borderPane.setCenter(new Label("This is Center"));
		
		
		Scene scene = new Scene(borderPane, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing BorderPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
