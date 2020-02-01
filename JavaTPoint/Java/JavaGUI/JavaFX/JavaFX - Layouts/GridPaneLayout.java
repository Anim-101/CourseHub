package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class GridPaneLayout extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label firstName = new Label("First Name");
		
		Label lastName = new Label("Last Name");
		
		TextField textFieldFirstName = new TextField();
		
		TextField textFieldLastName = new TextField();
		
		Button submitButton = new Button("Submit");
		
		GridPane gridPane = new GridPane();
		
		gridPane.addRow(0, firstName, textFieldFirstName);
		gridPane.addRow(1, lastName, textFieldLastName);
		gridPane.addRow(2, submitButton);
				
		Scene scene = new Scene(gridPane, 400, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing GridPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}