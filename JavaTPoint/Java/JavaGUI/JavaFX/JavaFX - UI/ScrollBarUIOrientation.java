package application;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ScrollBar;

public class ScrollBarUIOrientation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		ScrollBar scrollBar = new ScrollBar();
		
		scrollBar.setMin(0);
		scrollBar.setMax(200);
		scrollBar.setValue(110);
		
		scrollBar.setOrientation(Orientation.VERTICAL);
		scrollBar.setUnitIncrement(12);
		scrollBar.setBlockIncrement(10);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(scrollBar);
		
		Scene scene = new Scene(stackPane, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing ScrollBar UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
