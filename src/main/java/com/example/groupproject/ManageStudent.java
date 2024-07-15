package com.example.groupproject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class ManageStudent {

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Button addNewStudentButton;

    @FXML
    private TableView<UserStudent> studentTableView;

    @FXML
    private TableColumn<UserStudent, Integer> idColumn;

    @FXML
    private TableColumn<UserStudent, String> fullNameColumn;

    @FXML
    private TableColumn<UserStudent, String> genderColumn;

    @FXML
    private TableColumn<UserStudent, String> facultyColumn;

    @FXML
    private TableColumn<UserStudent, String> phoneNoColumn;

    @FXML
    private TableColumn<UserStudent, String> emailColumn;


    @FXML
    private Button submitButton;


    ObservableList<UserStudent> list = FXCollections.observableArrayList(
            new UserStudent(18,"Kapil Dev Bhandari","M","BCS","986800000","Kapil@gmail.com")
    );

    @FXML
    private void initialize() {

        idColumn.setCellValueFactory(new PropertyValueFactory<UserStudent,Integer>("id"));
        fullNameColumn.setCellValueFactory(new PropertyValueFactory<UserStudent,String>("fullName"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<UserStudent, String>("gender"));
        facultyColumn.setCellValueFactory(new PropertyValueFactory<UserStudent, String>("faculty"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<UserStudent, String>("phoneNo"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<UserStudent, String>("email"));


        studentTableView.setItems(list);
    }

    public void AddStudent(ActionEvent event) throws IOException {
        changescene(event, "AddTeacherAndStudent.fxml", "AddTeacherAndStudent Dashboard page!!!");

    }
}