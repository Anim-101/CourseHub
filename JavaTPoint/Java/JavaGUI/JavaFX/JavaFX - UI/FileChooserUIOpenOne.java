package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.layout.HBox; 
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

public class FileChooserUIOpenOne extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		FileChooser file = new FileChooser();
		
		file.setTitle("Open File");
		
		file.showOpenDialog(primaryStage);
		
		HBox hbox = new HBox();
		
		hbox.setSpacing(20);
		
		Scene scene = new Scene(hbox, 300, 100);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Open File in FileChooser UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
