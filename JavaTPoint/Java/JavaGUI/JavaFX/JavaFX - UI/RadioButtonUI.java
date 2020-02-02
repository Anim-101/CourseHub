package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class RadioButtonUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ToggleGroup toggleGroup = new ToggleGroup();
		
		RadioButton radioButtonOne = new RadioButton("Option 1");
		RadioButton radioButtonTwo = new RadioButton("Option 2");
		RadioButton radioButtonThree = new RadioButton("Option 3");
		RadioButton radioButtonFour = new RadioButton("Option 4");
		
		radioButtonOne.setToggleGroup(toggleGroup);
		radioButtonTwo.setToggleGroup(toggleGroup);
		radioButtonThree.setToggleGroup(toggleGroup);
		radioButtonFour.setToggleGroup(toggleGroup);
		
		VBox vbox = new VBox();
		
		vbox.setSpacing(10);
		
		vbox.getChildren().addAll(radioButtonOne, radioButtonTwo, radioButtonThree, radioButtonFour);
	
		Scene scene = new Scene(vbox, 400, 250, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing RadioButton UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
