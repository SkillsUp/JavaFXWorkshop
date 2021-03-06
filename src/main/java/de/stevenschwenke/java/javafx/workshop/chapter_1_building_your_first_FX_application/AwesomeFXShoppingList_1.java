package de.stevenschwenke.java.javafx.workshop.chapter_1_building_your_first_FX_application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/*
 * Explain this part of the workshop in the following order: 
 * 1. make eclipse project
 * 2. explain Scene Builder and build UI
 * 3. create this application class
 * 4. load fxml with FXMLLoader 
 * 5. implement Initializable interface and set label to "0"
 */
public class AwesomeFXShoppingList_1 extends Application implements Initializable {

	/** UI components with FX-mapping to the .fxml - file */
	@FXML
	private Label potatoesLabel;
	@FXML
	private Label applesLabel;
	@FXML
	private Label chipsLabel;
	@FXML
	private Label sumLabel;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// Loading out GUI from the fxml file. Binding to fields above happens
		// here.
		Parent root = FXMLLoader.load(getClass().getResource("/awesomeFXShoppingList_1.fxml"));
		Scene scene = new Scene(root, 418, 550);

		stage.setTitle("Awesome FX Shopping List");
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		potatoesLabel.setText("0");
		applesLabel.setText("0");
		chipsLabel.setText("0");
		sumLabel.setText("0");
	}
}
