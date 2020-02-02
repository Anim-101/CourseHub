package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;

public class BarChartCharts extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		String euro = "Euro";
		String pound = "Pound";
		String dollar = "Dollar";
		String frenc = "Franc";
		
		CategoryAxis xaxis = new CategoryAxis();
		
		NumberAxis yaxis = new NumberAxis(0.1, 2, 0.1);
		
		xaxis.setLabel("Currency");
		
		yaxis.setLabel("Dollar Price");
		
		BarChart <String, Float> barChart = new BarChart(xaxis, yaxis);
		
		barChart.setTitle("Dollar Conversion Chart");
		
		XYChart.Series<String, Float> series = new XYChart.Series<String, Float>();
		
		series.getData().add(new XYChart.Data(euro, 0.83));
		series.getData().add(new XYChart.Data(pound, 0.73));
		series.getData().add(new XYChart.Data(frenc, 1.00));
		series.getData().add(new XYChart.Data(dollar, 1.32));
		
		barChart.getData().add(series);
		
		Group group = new Group();
		
		group.getChildren().add(barChart);
		
		Scene scene = new Scene(group, 600, 400, Color.WHEAT);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing BarChart Charts");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
