package com.example.groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

import static com.example.groupproject.Uses.changescene;

public class Profile {

    @FXML
    private Label titleLabel;

    @FXML
    private Button logoutButton;


    public void Dashboard(ActionEvent event) throws IOException {
        changescene(event, "Dashboard.fxml", "Dashboard page!!!");
    }

}