package com.example.contadordecliques;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.converter.IntegerStringConverter;

public class HelloController {

    int contador = 0;

    @FXML
    private Label lblContador;

    @FXML
    void btnAdicionarClique(ActionEvent event) {

        adicionar();
        lblContador.setText("" + contador);
    }

    private int adicionar() {

        contador++;

        return contador;
    }
}