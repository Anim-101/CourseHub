package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CSSStyleTest extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label firstName = new Label("First Name");
		Label lastName = new Label("Last Name");
		Label email = new Label("Email");
		Label password = new Label("Password");
		
		TextField textFieldFirstName = new TextField();
		TextField textFieldLastName = new TextField();
		TextField textFieldEmail = new TextField();
		TextField textFieldPassword = new TextField();
		
		Button submitButton = new Button("Submit");
		
		submitButton.setId("submit");
		
		Button resetButton = new Button("Reset");
		
		Text title = new Text();
		
		title.setText("Sign Up");
		title.setX(120);
		title.setY(120);
		title.setUnderline(true);
		title.setId("title");
		
		GridPane root = new GridPane();
		
		root.addRow(0,  title);
		root.addRow(1, firstName, textFieldFirstName);
		root.addRow(2, lastName, textFieldLastName);
		root.addRow(3, email, textFieldEmail);
		root.addRow(4,  password, textFieldPassword);
		root.addRow(5, submitButton, resetButton);
		
		root.setHgap(10);
		root.setVgap(10);
		
		root.getStylesheets().add(getClass().getResource("form.css").toExternalForm());
		
		Scene scene = new Scene(root, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing CSS ID");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
