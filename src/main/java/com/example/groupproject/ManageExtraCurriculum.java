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

public class ManageExtraCurriculum {

    @FXML
    private Label dashboardTitleLabel;

    @FXML
    private Button addActivityButton;

    @FXML
    private TableView<UserActivity> activityTableView;

    @FXML
    private TableColumn<UserActivity, String> upcomingEventsColumn;

    @FXML
    private TableColumn<UserActivity, String> recentActivitiesColumn;

    @FXML
    private TableColumn<UserActivity, String> participationInSportColumn;

    @FXML
    private Button submitButton;

    ObservableList<UserActivity> list = FXCollections.observableArrayList(
            new UserActivity("Open House Carnival","SDG 7 Event","Tole Cup")
    );

    @FXML
    private void initialize() {

        upcomingEventsColumn.setCellValueFactory(new PropertyValueFactory<UserActivity,String>("upcomingEvents"));
        recentActivitiesColumn.setCellValueFactory(new PropertyValueFactory<UserActivity,String>("recentActivities"));
        participationInSportColumn.setCellValueFactory(new PropertyValueFactory<UserActivity, String>("participationInSport"));


        activityTableView.setItems(list);
    }
    public void AddActivity(ActionEvent event) throws IOException {
        changescene(event, "AddActivity.fxml", "AddActivity Dashboard page!!!");

    }

}