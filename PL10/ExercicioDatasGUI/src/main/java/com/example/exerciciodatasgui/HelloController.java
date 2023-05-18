package com.example.exerciciodatasgui;

import com.example.exerciciodatasgui.domain.Data;
import com.example.exerciciodatasgui.domain.DiaInvalidoException;
import com.example.exerciciodatasgui.domain.MesInvalidoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblDataPorExtenso;

    @FXML
    private TextField txtData;

    @FXML
    private TextField txtDiaDaSemana;

    @FXML
    void verDiaDaSemana(ActionEvent event) {

        Data data = criarData();

        if (data != null) {

            txtDiaDaSemana.setText(data.diaDaSemana());
        }
    }

    @FXML
    void verDataPorExtenso(ActionEvent event) {

        Data data = criarData();

        if (data != null) {
            lblDataPorExtenso.setText(data.toString());
        }

    }

    @FXML
    void limpar(ActionEvent event) {
        txtData.setText("");
        txtDiaDaSemana.setText("");
        lblDataPorExtenso.setText("");
    }

    private Data criarData() {

        Data result = null;

        try {

            String[] dt = txtData.getText().split("/");

            int ano = Integer.parseInt(dt[0]);
            int mes = Integer.parseInt(dt[1]);
            int dia = Integer.parseInt(dt[2]);

            result = new Data(ano, mes, dia);


        } catch (DiaInvalidoException | MesInvalidoException | NullPointerException e) {

            Alert a = new Alert(Alert.AlertType.ERROR, e.getMessage());
            a.showAndWait();

        } catch (Exception e) {

            Alert a = new Alert(Alert.AlertType.ERROR, "Valores inválidos");
            a.showAndWait();
            result = new Data();

        }
        return result;
    }
}
