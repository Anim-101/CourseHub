package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TextFieldUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label userIDLabel = new Label("User ID");
		Label passwordLabel = new Label("Password");
		
		TextField textFieldOne = new TextField();
		TextField textFieldTwo = new TextField();
		
		Button submitButton = new Button("Submit");
		
		GridPane gridPane = new GridPane();
		
		gridPane.addRow(0, userIDLabel, textFieldOne);
		gridPane.addRow(1, passwordLabel, textFieldTwo);
		gridPane.addRow(2, submitButton);
		
		Scene scene = new Scene(gridPane, 600, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing TextField UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
