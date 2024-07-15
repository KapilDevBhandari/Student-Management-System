package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class Dashboard {
    @FXML
    private Label label;

    @FXML
    private Button studentsignin;

    @FXML
    private Button teachersignin;

    @FXML
    private Button staffsignin;

    @FXML
    private Button adminsignin;

    @FXML
    public void studentsignin(ActionEvent event) throws IOException {
        changescene(event,"StudentSignin.fxml","Student dashboard");
    }
    @FXML
    public void teachersignin(ActionEvent event)throws  IOException{
        changescene(event, "TeacherSignin.fxml","Teacher dashboard");
    }

    @FXML
    public void adminsignin(ActionEvent event) throws IOException {
        changescene(event,"AdminSignin.fxml","Admin dashboard");
    }
    @FXML
    public void staffsignin(ActionEvent event)throws  IOException{
        changescene(event, "StaffSignin.fxml","Staff dashboard");
    }
}

