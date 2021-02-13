package ui;

import java.io.IOException;

import javafx.beans.value.ObservableValue;
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
		String psw = password.getText();
		UserAccount userA = classroom.existUser(name);
		if (userA == null) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Log in incorrect");
			alert.setHeaderText(null);
			alert.setContentText("The username does not exist" + 
					"");
			alert.showAndWait();
		}
		else if(password.getText().equals(userA.getPassword())) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("account-list.fxml"));

			fxmlLoader.setController(this);    	
			Parent loginPane = fxmlLoader.load();
			mainPanel.getChildren().clear();
			mainPanel.setTop(loginPane);

		} else {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Log in incorrect");
			alert.setHeaderText(null);
			alert.setContentText("The username and password given are incorrect\r\n" + 
					"");
			alert.showAndWait();
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
    private TextField profilePhotoAccount;

	@FXML
	private PasswordField passwordAccount;

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
		String usernameAccount = userNameAccount.getText();
		String pw = passwordAccount.getText();
		String pf = profilePhotoAccount.getText();
		String gndr = (String) gender.getUserData();
		String bday = (String) birthday.getUserData();
		
		final ToggleGroup group = new ToggleGroup();

		group.selectedToggleProperty().addListener(
		    (ObservableValue<? extends Toggle> ov, Toggle old_toggle, 
		    Toggle new_toggle) -> {
		        if (group.getSelectedToggle() != null) {
		            final Image image = new Image(
		                getClass().getResourceAsStream(
		                group.getSelectedToggle().getUserData().toString() +
		                ".jpg"));
		        icon.setImage(image);
		    }
		});

	}

	@FXML
	void singinButton(ActionEvent event) {

	}
	
	
	public void initialize() {
    	//the method (initialize) is called several times by diferents fxml file loads 
    }
	
	

}

