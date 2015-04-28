package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import application.customer;
public class Controller
{
	String STATE;
	@FXML
	TextField FN;
	@FXML
	TextField MI;
	@FXML
	TextField LN;
	@FXML
	TextField AD;
	@FXML
	TextField City;
	@FXML
	ComboBox<String> ST;
	@FXML
	ToggleGroup gender;
	@FXML
	RadioButton M;
	@FXML
	RadioButton F;
	@FXML
	Button S;
	@FXML
	Button C;
	@FXML
	PasswordField Zip;
	@FXML
    private void initialize() {
        ST.getItems().addAll("Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming");
        ST.setValue("Alabama");
	}
	@FXML
	private void state(){
		STATE = ST.getSelectionModel().getSelectedItem();
	}
	@FXML
	private void save(){
		String gen;
		if(M.isSelected()){
			gen = "MALE";
		}else
			gen = "FEMALE";
		customer cust = new customer(FN.getText(),MI.getText(),LN.getText(),gen, AD.getText(),City.getText(),this.STATE, Zip.getText());
	}
	@FXML
	private void clear(){
		FN.clear();
		MI.clear();
		LN.clear();
		AD.clear();
		City.clear();
		Zip.clear();
		ST.setValue("Alabama");
		M.setSelected(false);
		F.setSelected(false);
		
	}
	
}
