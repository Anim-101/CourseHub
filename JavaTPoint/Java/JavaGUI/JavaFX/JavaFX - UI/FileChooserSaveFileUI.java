package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

import java.io.File;

public class FileChooserSaveFileUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Button button = new Button("Save");
		
		button.setOnAction(e-> {
			
			FileChooser file = new FileChooser();
			
			file.setTitle("Save Image");
			
			File fileSave = file.showSaveDialog(primaryStage);
			
			System.out.println(fileSave);
		});
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(button);
		
		Scene scene = new Scene(stackPane, 200, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing FileChooserUI Save");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
