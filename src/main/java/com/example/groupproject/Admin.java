package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class Admin {

    @FXML
    private ImageView imageViewAdmin;

    @FXML
    private ImageView imageViewStudent;

    @FXML
    private ImageView imageViewStaff;

    @FXML
    private ImageView imageViewProfileUser;

    @FXML
    private ImageView imageViewTeacher;

    @FXML
    private Button manageStudentButton;

    @FXML
    private Button manageStaffButton;

    @FXML
    private Button profileButton;

    @FXML
    private Button backButton;

    @FXML
    private Button dashboardButton;

    @FXML
    private Button manageExtraCurriculumButton;

    @FXML
    private Button calendarButton;

    @FXML
    private Button studentProblemFormButton;

    @FXML
    private Button studentParticipationInSportsFormButton;

    @FXML
    private Button questionFormButton;

    @FXML
    private Button manageTeacherButton;

    @FXML
    public void back(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }

    @FXML
    public void ManageStudent(ActionEvent event) throws IOException {
        changescene(event, "ManageStudent.fxml", "ManageStudent page!!!");
    }

    @FXML
    public void ManageTeacher(ActionEvent event) throws IOException {
       changescene(event, "ManageTeacher.fxml", "ManageTeacher page!!!");
    }

    @FXML
    public void ManageStaff(ActionEvent event) throws IOException {
        changescene(event, "ManageStaff.fxml", "ManageStaff page!!!");
    }

    @FXML
    public void Dashboard(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }

    @FXML
    public void Calendar(ActionEvent event) throws IOException {
        changescene(event, "Calendar.fxml", "Calender page!!!");
    }

    @FXML
    public void QuestionForm(ActionEvent event) throws IOException {
        changescene(event, "QuestionForm.fxml", "QuestionForm page!!!");
    }

    @FXML
    public void StudentProblemForm(ActionEvent event) throws IOException {
        changescene(event, "StudentProblemForm.fxml", "StudentProblemForm page!!!");
    }

    @FXML
    public void ManageExtraCurriculum(ActionEvent event) throws IOException {
        changescene(event, "ManageExtraCurriculum.fxml", "ManageExtraCurriculum page!!!");
    }

    @FXML
    public void StudentParticipationInSportsForm(ActionEvent event) throws IOException {
        changescene(event, "StudentParticipationInSportsForm.fxml", "StudentParticipationInSportsForm page!!!");
    }

    @FXML
    public void Profile(ActionEvent event) throws IOException {
        changescene(event, "Profile.fxml", "Profile page!!!");
    }



}