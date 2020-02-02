package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuUI extends Application {

	public void start(Stage primaryStage) throws Exception {
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		
		MenuItem fileMenuOne = new MenuItem("New");
		MenuItem fileMenuTwo = new MenuItem("Save");
		MenuItem fileMenuThree = new MenuItem("Exit");
		
		fileMenu.getItems().addAll(fileMenuOne, fileMenuTwo, fileMenuThree);
		
		Menu editMenu = new Menu("Edit");
		
		MenuItem editMenuOne = new MenuItem("Cut");
		MenuItem editMenuTwo = new MenuItem("Copy");
		MenuItem editMenuThree = new MenuItem("Paste");
		
		editMenu.getItems().addAll(editMenuOne, editMenuTwo, editMenuThree);
		
		menuBar.getMenus().addAll(fileMenu, editMenu);
		
		BorderPane borderPane = new BorderPane();
		
		borderPane.setTop(menuBar);
		
		Scene scene = new Scene(borderPane, 200, 300);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Menu UI");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
