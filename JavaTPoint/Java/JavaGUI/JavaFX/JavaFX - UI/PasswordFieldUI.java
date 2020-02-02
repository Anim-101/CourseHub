package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class PasswordFieldUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label userIDLabel = new Label("User ID");
		Label passwordLabel = new Label("Password");
		
		TextField textField = new TextField();
		
		PasswordField passwordField = new PasswordField();
		
		passwordField.setPromptText("Enter Password Here");
		
		Button submitButton = new Button("Submit");
		
		GridPane gridPane = new GridPane();
		
		gridPane.addRow(0, userIDLabel, textField);
		gridPane.addRow(1, passwordLabel, passwordField);
		gridPane.addRow(2, submitButton);
		
		Scene scene = new Scene(gridPane, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing PasswordField UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
