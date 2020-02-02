package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class LineChartCharts extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		final NumberAxis xAxis = new NumberAxis(2008, 2018, 1);
		final NumberAxis yAxis = new NumberAxis(10, 80, 5);
		
		xAxis.setLabel("Year");
		yAxis.setLabel("Price");
		
		LineChart lineChart = new LineChart(xAxis, yAxis);
		
		XYChart.Series series = new XYChart.Series();
		
		series.setName("Stock Analysis");
		
		series.getData().add(new XYChart.Data(2009, 25));
		series.getData().add(new XYChart.Data(2010, 15));
		series.getData().add(new XYChart.Data(2011, 68));
		series.getData().add(new XYChart.Data(2012, 60));
		series.getData().add(new XYChart.Data(2013, 35));
		series.getData().add(new XYChart.Data(2014, 55));
		series.getData().add(new XYChart.Data(2015, 45));
		series.getData().add(new XYChart.Data(2016, 67));
		series.getData().add(new XYChart.Data(2017, 78));
		
		lineChart.getData().add(series);
		
		Group group = new Group();
		
		group.getChildren().add(lineChart);
		
		Scene scene = new Scene(group, 600, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing LineChart Charts");
		primaryStage.show();
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
