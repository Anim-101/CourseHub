package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Translate;

public class MultipleTransformation extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Rectangle rectangle = new Rectangle(50, 10, 200, 250);
		
		Circle circle = new Circle(300, 260, 100);
		
		circle.setFill(Color.LIGHTCORAL);
		circle.setStroke(Color.BLACK);
		
		rectangle.setFill(Color.LIMEGREEN);
		rectangle.setStroke(Color.BLACK);
		
		Translate translate = new Translate();
		
		translate.setX(100);
		translate.setY(10);
		
		Rotate rotate = new Rotate();
		
		rotate.setAngle(30);
		rotate.setPivotX(50);
		rotate.setPivotY(100);
		
		Scale scale = new Scale();
		
		scale.setX(1.5);
		scale.setY(1.2);
		scale.setPivotX(50);
		scale.setPivotY(50);
		
		Shear shear = new Shear();
		
		shear.setX(0.3);
		
		rectangle.getTransforms().addAll(translate, rotate, scale, shear);
		
		Group group = new Group();
		
		group.getChildren().addAll(rectangle, circle);
		
		Scene scene = new Scene(group, 550, 530);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Multiple Transform");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}