package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CSSTest extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label firstName = new Label("First Name");
		
		Label lastName = new Label("Last Name");
		
		TextField textFieldFirstName = new TextField();
		
		TextField textFieldLastName = new TextField();
		
		Button submitButton = new Button("Submit");
		
		GridPane gridPane = new GridPane();
		
		gridPane.setHgap(10);
		gridPane.setVgap(15);
	
		gridPane.addRow(0,  firstName, textFieldFirstName);
		gridPane.addRow(1, lastName, textFieldLastName);
		gridPane.addRow(2,  submitButton);
		gridPane.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
		
		Scene scene = new Scene(gridPane, 400, 300);
	
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing CSS");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
