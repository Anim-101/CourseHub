package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;

public class PieChartChartsData extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		PieChart pieChart = new PieChart();
		
		pieChart.setData(getChartData());
		
		pieChart.setLegendSide(Side.LEFT);
		
		pieChart.setTitle("Computer Language Popularities");
		
		pieChart.setClockwise(false);
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(pieChart);
		
		Scene scene = new Scene(stackPane, 800, 600);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing Pie Chart Charts with Different Data");
		primaryStage.show();
	}
	
	private ObservableList<Data> getChartData() {
		
		ObservableList<Data> list = FXCollections.observableArrayList();
		
		list.addAll(new PieChart.Data("JavaScript", 30.8),
				new PieChart.Data("Ruby", 11.8),
				new PieChart.Data("Java", 10.8),
				new PieChart.Data("Python", 11.6),
				new PieChart.Data("PHP", 7.2),
				new PieChart.Data("Objective-C", 10.7),
				new PieChart.Data("C", 5.2),
				new PieChart.Data("C++", 4.3),
				new PieChart.Data("Go", 3.8),
				new PieChart.Data("CSS", 3.8)
				);
		
		
		return list;
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
