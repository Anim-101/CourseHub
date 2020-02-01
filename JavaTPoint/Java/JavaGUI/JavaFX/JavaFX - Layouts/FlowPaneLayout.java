package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class FlowPaneLayout extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		FlowPane flowPane = new FlowPane();
		
		flowPane.setVgap(6);
		flowPane.setHgap(6);
		flowPane.setPrefWrapLength(250);
		
		flowPane.getChildren().add(new Button("Start"));
		flowPane.getChildren().add(new Button("Stop"));
		flowPane.getChildren().add(new Button("Exit"));
		
		Scene scene = new Scene(flowPane, 300, 200);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Shwoing FlowPane Layout");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
