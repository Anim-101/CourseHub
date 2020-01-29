package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.transform.Shear;

public class Shearing extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangleOne = new Rectangle(60, 100, 150, 200);
		
		Rectangle rectangleTwo = new Rectangle(350, 100, 150, 200);
		
		Rectangle rectangleThree = new Rectangle(640, 100, 150, 200);
		
		Text textOne = new Text("After X Shearing");
		
		Text textTwo = new Text("Original - No Shearing");
		
		Text textThree = new Text("After Y Shearing");
		
		textOne.setX(70);
		textOne.setY(370);
		
		textTwo.setX(340);
		textTwo.setY(370);
		
		textThree.setX(640);
		textThree.setY(370);
		
		textOne.setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		textTwo.setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		textThree.setFont(Font.font("calibri", FontWeight.BOLD, FontPosture.ITALIC, 20));
		
		rectangleOne.setFill(Color.BLANCHEDALMOND);
		rectangleOne.setStroke(Color.BLACK);
		
		rectangleTwo.setFill(Color.DARKOLIVEGREEN);
		rectangleTwo.setStroke(Color.BLACK);
		
		rectangleThree.setFill(Color.CADETBLUE);
		rectangleThree.setStroke(Color.BLACK);
		
		Shear shearX = new Shear();
		
		shearX.setPivotX(200);
		shearX.setPivotY(250);
		shearX.setX(0.3);
		shearX.setY(0.0);
		
		rectangleOne.getTransforms().add(shearX);
		
		Shear shearY = new Shear();
		
		shearY.setPivotX(600);
		shearY.setPivotY(80);
		shearY.setX(0.0);
		shearY.setY(0.2);
		
		rectangleThree.getTransforms().add(shearY);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangleOne, rectangleTwo, rectangleThree, textOne, textTwo, textThree);
		
		Scene scene = new Scene(group, 810, 420);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Shearing");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
	
		launch(args);
	}
}