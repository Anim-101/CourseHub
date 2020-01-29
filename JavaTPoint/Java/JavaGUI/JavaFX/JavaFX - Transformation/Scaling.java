package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.transform.Scale;

public class Scaling extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circleOne = new Circle(230, 200, 100);
		
		Circle circleTwo = new Circle(550, 200, 100);
		
		circleOne.setFill(Color.YELLOW);
		circleOne.setStroke(Color.BLACK);
		
		circleTwo.setFill(Color.LIGHTYELLOW);
		circleTwo.setStroke(Color.BLACK);
		
		Text textOne = new Text("Original Circle");
		
		Text textTwo = new Text("Scaled Circle");
		
		textOne.setX(170);
		textOne.setY(400);
		textOne.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.ITALIC, 20));
		
		textTwo.setX(770);
		textTwo.setY(500);
		textTwo.setFont(Font.font("calibri", FontWeight.BLACK, FontPosture.ITALIC, 20));
		
		Scale scale = new Scale();
		
		scale.setX(1.5);
		scale.setY(1.5);
		
		circleTwo.getTransforms().add(scale);
		
		Group group = new Group();
		
		group.getChildren().addAll(circleOne, circleTwo, textOne, textTwo);
		
		Scene scene = new Scene(group, 1050, 550);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Scaling");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
