package com.example.groupproject;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentForm implements Initializable {

    @FXML
    private TextField studentIdField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private ComboBox<String> facultyChoiceBox;

    @FXML
    private ComboBox<String> genderChoiceBox;

    @FXML
    private Button submitButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        facultyChoiceBox.setItems(FXCollections.observableArrayList("Computer Science", "Hotel Management"));
        genderChoiceBox.setItems(FXCollections.observableArrayList("Male", "Female", "Other"));
    }

    @FXML
    public void clickSubmit(ActionEvent event){
        System.out.println(facultyChoiceBox.getValue());
    }
}