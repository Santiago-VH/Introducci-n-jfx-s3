package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.stage.Stage;

public class Main extends Application{

	

	@Override
	public void start(Stage primaryStage) throws Exception {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/calculatorView.fxml"));
				SplitPane root = (SplitPane)loader.load();
				CalculatorGUI controller = loader.getController();
				controller.setMain(this);
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.setTitle("Calculadora");
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
