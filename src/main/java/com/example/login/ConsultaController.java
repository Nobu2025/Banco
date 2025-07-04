package com.example.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ConsultaController {

    @FXML private Label label1;
    @FXML private Button btnSaldo;
    @FXML private Label label2;
    @FXML private Label Consul;
    @FXML private Button revisar;

    private usuario usuario1 = new usuario();

    @FXML
    protected void revisar(ActionEvent event) {
        int saldoActual = usuario1.getSaldo();
        Consul.setText("Saldo actual: $" + saldoActual);
    }
}
