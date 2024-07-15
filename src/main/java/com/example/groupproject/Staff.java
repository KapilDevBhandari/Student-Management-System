package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class Staff {

    @FXML
    private ImageView imageViewStaff;

    @FXML
    private ImageView imageViewProfileUser;

    @FXML
    private Button profileButton;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button calendarButton;

    @FXML
    private Button manageExtraCurriculumButton;

    @FXML
    private Button studentProblemFormButton;

    @FXML
    private Button backButton;

    @FXML
    public void Dashboard(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }

    @FXML
    public void back(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }

    @FXML
    public void Calendar(ActionEvent event) throws IOException {
        changescene(event, "Calendar.fxml", "Calender page!!!");
    }

    @FXML
    public void StudentProblemForm(ActionEvent event) throws IOException {
        changescene(event, "StudentProblemForm.fxml", "StudentProblemForm page!!!");
    }

    @FXML
    public void Profile(ActionEvent event) throws IOException {
        changescene(event, "Profile.fxml", "Profile page!!!");
    }

    @FXML
    public void ManageExtraCurriculum(ActionEvent event) throws IOException {
        changescene(event, "ManageExtraCurriculum.fxml", "ManageExtraCurriculum page!!!");
    }

}