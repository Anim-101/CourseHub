package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CSSInlineStyle extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label firstName = new Label("First Name");
		
		firstName.setStyle("-fx-background-color:Wheat; -fx-text-fill:Black; -fx-font-size:16"); 
		
		Label lastName = new Label("Last Name");
		
		lastName.setStyle("-fx-background-color:Wheat; -fx-text-fill:Black; -fx-font-size:16;");
		
		TextField textFieldFirstName = new TextField();
		
		textFieldFirstName.setStyle("-fx-background-color:Wheat; -fx-text-fill:Black; -fx-font-size:16;");
		
		TextField textFieldLastName = new TextField();
		
		textFieldLastName.setStyle("-fx-background-color:Wheat; fx-text-fill:Black; -fx-font-size:16;");
		
		Button submitButton = new Button("Submit");
		
		submitButton.setStyle("-fx-background-color:Black; -fx-font-family:courier_new; -fx-text-fill:White; -fx-font-size:16;");
		
		GridPane gridPane = new GridPane();
		
		gridPane.setHgap(10);
		gridPane.setVgap(15);
		
		gridPane.addRow(0, firstName, textFieldFirstName);
		gridPane.addRow(1, lastName, textFieldLastName);
		gridPane.addRow(2, submitButton);
		
		Scene scene = new Scene(gridPane, 400, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing CSS Inline Style");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
