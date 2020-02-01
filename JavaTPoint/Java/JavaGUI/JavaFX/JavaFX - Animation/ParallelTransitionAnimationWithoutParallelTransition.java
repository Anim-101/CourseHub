package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;

public class ParallelTransitionAnimationWithoutParallelTransition extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		Circle circleOne = new Circle(50, 100, 50);
		
		Circle circleTwo = new Circle(550, 100, 50);
		
		Circle circleThree = new Circle(50, 400, 50);
		
		Circle circleFour = new Circle(550, 400, 50);
		
		
		circleOne.setFill(Color.BLUE);
		circleOne.setStroke(Color.BLACK);
		
		circleTwo.setFill(Color.LIME);
		circleTwo.setStroke(Color.BLACK);
		
		circleThree.setFill(Color.RED);
		circleThree.setStroke(Color.BLACK);
		
		circleFour.setFill(Color.MEDIUMPURPLE);
		circleFour.setStroke(Color.BLACK);
		
		Line lineOne = new Line(100, 100, 500, 100);
		
		Line lineTwo = new Line(100, 400, 500, 400);
		
		Line lineThree = new Line(50, 150, 50, 350);
		
		Line lineFour = new Line(550, 150, 550, 350);
		
		RotateTransition rotateLineThree = new RotateTransition();
		
		rotateLineThree.setAxis(Rotate.X_AXIS);
		rotateLineThree.setByAngle(180);
		rotateLineThree.setAutoReverse(true);
		rotateLineThree.setDuration(Duration.millis(500));
		rotateLineThree.setCycleCount(50);
		rotateLineThree.setNode(lineThree);
		rotateLineThree.play();
		
		RotateTransition rotateLineFour = new RotateTransition();
		
		rotateLineFour.setAxis(Rotate.X_AXIS);
		rotateLineFour.setByAngle(180);
		rotateLineFour.setAutoReverse(true);
		rotateLineFour.setDuration(Duration.millis(500));
		rotateLineFour.setCycleCount(50);
		rotateLineFour.setNode(lineFour);
		rotateLineFour.play();
		
		FadeTransition fadeTransitionCircleOne = new FadeTransition();
		
		fadeTransitionCircleOne.setAutoReverse(true);
		fadeTransitionCircleOne.setFromValue(10);
		fadeTransitionCircleOne.setToValue(0.1);
		fadeTransitionCircleOne.setCycleCount(50);
		fadeTransitionCircleOne.setDuration(Duration.millis(500));
		fadeTransitionCircleOne.setNode(circleOne);
		fadeTransitionCircleOne.play();
		
		FadeTransition fadeTransitionCircleTwo = new FadeTransition();
		
		fadeTransitionCircleTwo.setAutoReverse(true);
		fadeTransitionCircleTwo.setFromValue(10);
		fadeTransitionCircleTwo.setToValue(0.1);
		fadeTransitionCircleTwo.setCycleCount(50);
		fadeTransitionCircleTwo.setDuration(Duration.millis(500));
		fadeTransitionCircleTwo.setNode(circleTwo);
		fadeTransitionCircleTwo.play();
		
		FadeTransition fadeTransitionCircleThree = new FadeTransition();
		
		fadeTransitionCircleThree.setAutoReverse(true);
		fadeTransitionCircleThree.setFromValue(10);
		fadeTransitionCircleThree.setToValue(0.1);
		fadeTransitionCircleThree.setCycleCount(50);
		fadeTransitionCircleThree.setDuration(Duration.millis(500));
		fadeTransitionCircleThree.setNode(circleThree);
		fadeTransitionCircleThree.play();
		
		
		FadeTransition fadeTransitionCircleFour = new FadeTransition();
		
		fadeTransitionCircleFour.setAutoReverse(true);
		fadeTransitionCircleFour.setFromValue(10);
		fadeTransitionCircleFour.setToValue(0.1);
		fadeTransitionCircleFour.setCycleCount(50);
		fadeTransitionCircleFour.setDuration(Duration.millis(500));
		fadeTransitionCircleFour.setNode(circleFour);
		fadeTransitionCircleFour.play();
		
		TranslateTransition translateCircleOne = new TranslateTransition();
		
		translateCircleOne.setByY(300);
		translateCircleOne.setCycleCount(50);
		translateCircleOne.setDuration(Duration.millis(500));
		translateCircleOne.setAutoReverse(true);
		translateCircleOne.setNode(circleOne);
		translateCircleOne.play();
		
		TranslateTransition translateCircleTwo = new TranslateTransition();
		
		translateCircleTwo.setByY(300);
		translateCircleTwo.setCycleCount(50);
		translateCircleTwo.setDuration(Duration.millis(500));
		translateCircleTwo.setAutoReverse(true);
		translateCircleTwo.setNode(circleTwo);
		translateCircleTwo.play();
		
		TranslateTransition translateCircleThree = new TranslateTransition();
		
		translateCircleThree.setByY(-300);
		translateCircleThree.setCycleCount(50);
		translateCircleThree.setDuration(Duration.millis(500));
		translateCircleThree.setAutoReverse(true);
		translateCircleThree.setNode(circleThree);
		translateCircleThree.play();
		
		TranslateTransition translateCircleFour = new TranslateTransition();
		
		translateCircleFour.setByY(-300);
		translateCircleFour.setCycleCount(50);
		translateCircleFour.setDuration(Duration.millis(500));
		translateCircleFour.setNode(circleFour);
		translateCircleFour.play();
		
		TranslateTransition translateLineOne = new TranslateTransition();
		
		translateLineOne.setByY(300);
		translateLineOne.setCycleCount(50);
		translateLineOne.setDuration(Duration.millis(500));
		translateLineOne.setAutoReverse(true);
		translateLineOne.setNode(lineOne);
		translateLineOne.play();
		
		TranslateTransition translateLineTwo = new TranslateTransition();
		
		translateLineTwo.setByY(-300);
		translateLineTwo.setCycleCount(50);
		translateLineTwo.setDuration(Duration.millis(500));
		translateLineTwo.setAutoReverse(true);
		translateLineTwo.setNode(lineTwo);
		translateLineTwo.play();
		
		Group group = new Group();
		
		group.getChildren().addAll(circleOne, circleTwo, circleThree, circleFour, lineOne, lineTwo, lineThree, lineFour);
		
		Scene scene = new Scene(group, 600, 550, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Parallel Transition Animation without using Parallel Transition");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
