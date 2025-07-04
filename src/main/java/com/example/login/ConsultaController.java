package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ConsultaController extends usuario {


    @FXML private Label label1;
    @FXML private Button btnDepositar;
    @FXML private Label label2;
    @FXML private Label Consul;

    @FXML
    protected void Consulta(ActionEvent event) {

        Consul.setText(getSaldo());
    }
}
