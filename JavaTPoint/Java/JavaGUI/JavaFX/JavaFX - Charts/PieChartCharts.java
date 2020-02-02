package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;

public class PieChartCharts extends Application {
	
	public void start(Stage primaryStage) throws Exception {
		
		PieChart pieChart = new PieChart();
		
		pieChart.setData(getChartData());
		
		StackPane stackPane = new StackPane();
		
		stackPane.getChildren().add(pieChart);
		
		Scene scene = new Scene(stackPane, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Showing PieChart Charts");
		primaryStage.show();
	}
	
	private ObservableList<Data> getChartData() {
		
		ObservableList<Data> list = FXCollections.observableArrayList();
		
		list.addAll(new PieChart.Data("JavaFX", 90),
				new PieChart.Data("JavaSwing", 10));
		
		return list;
	}
	
	public static void main(String [] args) {
		
		launch(args);
	}
}
