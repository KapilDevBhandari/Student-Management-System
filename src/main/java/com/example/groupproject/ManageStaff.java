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

public class ManageStaff {

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Button addNewStaffButton;

    @FXML
    private TableView<UserStaff> staffTableView;

    @FXML
    private TableColumn<UserStaff, Integer> idColumn;

    @FXML
    private TableColumn<UserStaff, String> fullNameColumn;

    @FXML
    private TableColumn<UserStaff, String> genderColumn;

    @FXML
    private TableColumn<UserStaff, String> roleColumn;

    @FXML
    private TableColumn<UserStaff, String> phoneNoColumn;

    @FXML
    private TableColumn<UserStaff, String> emailColumn;

    @FXML
    private Button submitButton;

    ObservableList<UserStaff> list = FXCollections.observableArrayList(
            new UserStaff(18,"Kapil Dev Bhandari","M","Admission Officer","986800000","Kapil@gmail.com")
    );

    @FXML
    private void initialize() {

        idColumn.setCellValueFactory(new PropertyValueFactory<UserStaff,Integer>("id"));
        fullNameColumn.setCellValueFactory(new PropertyValueFactory<UserStaff,String>("fullName"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<UserStaff, String>("gender"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<UserStaff, String>("faculty"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<UserStaff, String>("phoneNo"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<UserStaff, String>("email"));


        staffTableView.setItems(list);
    }
    public void AddSaff(ActionEvent event) throws IOException {
        changescene(event, "AddStaff.fxml", "AddStaff Dashboard page!!!");

    }

}