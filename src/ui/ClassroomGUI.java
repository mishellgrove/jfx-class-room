package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import model.Classroom;
import model.UserAccount;

public class ClassroomGUI {

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	@FXML
	private BorderPane mainPanel;


	@FXML
	void login(ActionEvent event) throws IOException {
		String name = username.getText();
		UserAccount userA = classroom.existUser(name);
		if(userA == null) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Log in incorrect");
			alert.setHeaderText(null);
			alert.setContentText("The username and password given are incorrect\r\n" + 
					"");
			alert.showAndWait();

		} else {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("account-list.fxml"));

			fxmlLoader.setController(this);    	
			Parent loginPane = fxmlLoader.load();
			mainPanel.getChildren().clear();
			mainPanel.setTop(loginPane);
		}
	}

	@FXML
	void singup(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));

		fxmlLoader.setController(this);    	
		Parent addUser = fxmlLoader.load();
		mainPanel.getChildren().clear();
		mainPanel.setTop(addUser);

	}

	@FXML
	private TextField userNameAccount;

	@FXML
	private TextField passwordAccount;

	@FXML
	private RadioButton male;

	@FXML
	private RadioButton female;

	@FXML
	private RadioButton other;

	@FXML
	private ToggleGroup gender;

	@FXML
	private DatePicker birthday;

	@FXML
	private ChoiceBox<?> favorite;

	@FXML
	private CheckBox software;

	@FXML
	private CheckBox telematic;

	@FXML
	private CheckBox industrial;
	
	private Classroom classroom;
	
	public ClassroomGUI(Classroom cr) {
		classroom = cr;
	}

	@FXML
	void browseButton(ActionEvent event) {

	}

	@FXML
	void createAccountButton(ActionEvent event) {

	}

	@FXML
	void singinButton(ActionEvent event) {

	}
	
	
	public void initialize() {
    	//the method (initialize) is called several times by diferents fxml file loads 
    }
	
	

}

