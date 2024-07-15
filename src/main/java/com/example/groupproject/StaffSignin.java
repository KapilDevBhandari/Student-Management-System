package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class StaffSignin {
    @FXML
    public void back(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");

    }
    @FXML
    public void Staff(ActionEvent event) throws IOException {
        changescene(event, "Staff.fxml", "Staff Dashboard page!!!");
    }
}
