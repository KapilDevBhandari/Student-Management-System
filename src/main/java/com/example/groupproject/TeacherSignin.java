package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class TeacherSignin {
    @FXML
    public void back(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }
        @FXML
        public void Teacher(ActionEvent event) throws IOException {
            changescene(event, "Teacher.fxml", "Teacher Dashboard page!!!");
        }

    }

