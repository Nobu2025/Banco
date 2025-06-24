package com.example.login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    String Correo = "patata@gmail";
    String password = "patata";
    @FXML
    private Label welcomeText;

    public TextField username;
    public PasswordField pass;



    @FXML
    protected void irVentana2(ActionEvent event) throws IOException {
        String username = this.username.getText();
        String pass = this.pass.getText();

        if(Correo.equals(username)&&password.equals(pass)){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ventana2.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Ventana 2");
        stage.show();}


    }
}