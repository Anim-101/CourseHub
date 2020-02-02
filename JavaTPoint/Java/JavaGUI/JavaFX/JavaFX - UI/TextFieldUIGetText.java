package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TextFieldUIGetText extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label userIDLabel = new Label("User ID");
		Label passwordLabel = new Label("Password");
		
		TextField textFieldUserID = new TextField();
		TextField textFieldPassword = new TextField();
		
		Button submitButton = new Button("Submit");
		
		submitButton.setOnAction(e->System.out.println("Your Entered USER ID: " + textFieldUserID.getText() + " And Password: " + textFieldPassword.getText()));
	
		GridPane gridPane = new GridPane();
		
		gridPane.addRow(0, userIDLabel, textFieldUserID);
		gridPane.addRow(1, passwordLabel, textFieldPassword);
		gridPane.addRow(2, submitButton);
		
		Scene scene = new Scene(gridPane, 300, 150);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing TextField UI Getting Text");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
