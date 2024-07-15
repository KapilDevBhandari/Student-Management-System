package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class StudentSignin {
    @FXML
    public void back(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");

    }

    @FXML
    public void Student(ActionEvent event) throws IOException {
        changescene(event, "Student.fxml", "Student Dashboard page!!!");
    }
}
