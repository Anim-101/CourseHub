package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FileChooserUIOpenSecond extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label label = new Label("File:");
		
		TextField textField = new TextField();
		
		Button button = new Button("Browse");
		
		button.setOnAction(e-> {
			
			FileChooser file = new FileChooser();
			
			file.setTitle("Open File");
			
			file.showOpenDialog(primaryStage);
		});
		
		HBox hbox = new HBox();
		
		hbox.setSpacing(10);
		
		hbox.getChildren().addAll(label, textField, button);
		
		Scene scene = new Scene(hbox, 350, 100);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing FileChooser UI Open");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
