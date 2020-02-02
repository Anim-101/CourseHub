package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Tooltip;

public class TooltipUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		PasswordField passwordField = new PasswordField();
		
		Tooltip tooltip = new Tooltip();
		
		tooltip.setText("Information");
		
		passwordField.setTooltip(tooltip);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(passwordField);
		
		Scene scene = new Scene(stackPane, 300, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Tooltip UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
