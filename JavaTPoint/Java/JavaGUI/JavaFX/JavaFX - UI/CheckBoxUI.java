package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.control.CheckBox;


public class CheckBoxUI extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Label label = new Label("What Games Do You Love Playing?");
		
		CheckBox checkBoxOne = new CheckBox("Assassin's Creed");
		CheckBox checkBoxTwo = new CheckBox("Call Of Duty");
		CheckBox checkBoxThree = new CheckBox("The Witcher");
		CheckBox checkBoxFour = new CheckBox("Prince Of Persia");
		
		HBox hbox = new HBox();
		
		hbox.getChildren().addAll(checkBoxOne, checkBoxTwo, checkBoxThree, checkBoxFour);
		
		hbox.setSpacing(6);
		
		Scene scene = new Scene(hbox, 500, 100, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing CheckBox UI");
		primaryStage.show();
	}

	public static void main(String [] args) {
		
		launch(args);
	}
}
