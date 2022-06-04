package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculatorGUI implements Initializable {

	private Main main;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	button1.setOnAction(this::add1);
	button2.setOnAction(this::add2);
	button3.setOnAction(this::add3);
	button4.setOnAction(this::add4);
	button5.setOnAction(this::add5);
	button6.setOnAction(this::add6);
	button7.setOnAction(this::add7);
	button8.setOnAction(this::add8);
	button9.setOnAction(this::add9);
	button0.setOnAction(this::add0);
	buttonMultiply.setOnAction(this::addMult);
	buttonAdd.setOnAction(this::addPlus);
	buttonSubtract.setOnAction(this::addMinus);
	}
	
	@FXML
	public void add1(ActionEvent event) {
		
	}
	
	@FXML
	public void add2(ActionEvent event) {
		
	}
	
	@FXML
	public void add3(ActionEvent event) {
		
	}
	
	@FXML
	public void add4(ActionEvent event) {
		
	}
	
	@FXML
	public void add5(ActionEvent event) {
		
	}
	
	@FXML
	public void add6(ActionEvent event) {
		
	}
	
	@FXML
	public void add7(ActionEvent event) {
		
	}
	
	@FXML
	public void add8(ActionEvent event) {
		
	}
	
	@FXML
	public void add9(ActionEvent event) {
		
	}
	
	@FXML
	public void add0(ActionEvent event) {
		
	}
	
	@FXML
	public void addMult(ActionEvent event) {
		
	}
	
	@FXML
	public void addPlus(ActionEvent event) {
		
	}
	
	@FXML
	public void addMinus(ActionEvent event) {
		
	}
	
	
	
	
	
	
	
	
    @FXML
    private TextArea textAreaHistorial;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button0;

    @FXML
    private Button buttonMultiply;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonSubtract;

    @FXML
    private Button buttonCalculate;

    @FXML
    private TextField textResult;

    @FXML
    private TextField textOperation;

    
    @FXML
    void calculate(ActionEvent event) {

    }

    @FXML
    void operate(ActionEvent event) {

    }
    
    void Result(ActionEvent event) {

    }


	public Main getMain() {
		return main;
	}


	public void setMain(Main main) {
		this.main = main;
	}
}
