package com.armenise.fom_armenise;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class FormController {
    @FXML
    private TextField txtCognome;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIndirizzo;
    @FXML
    private TextField txtNumero;
    @FXML
    private Label labelFeedback;

    @FXML
    protected void onButtonClick() {

        if (txtNome.getText().equals("") || txtCognome.getText().equals("") || txtIndirizzo.getText().equals("") || txtNumero.getText().equals("")) {
            labelFeedback.setTextFill(Color.RED);
            labelFeedback.setText("Verifica di aver inserito i dati correttamente.");
        } else {
            System.out.println("Dati anagrafici:");
            System.out.println("Nome: "+txtNome.getText());
            System.out.println("Cognome: "+txtCognome.getText());
            System.out.println("Indirizzo: "+txtIndirizzo.getText());
            System.out.println("Numero di telefono: "+txtNumero.getText());

            labelFeedback.setTextFill(Color.GREEN);
            labelFeedback.setText("Modulo inviato con successo!");

            txtNome.setText("");
            txtCognome.setText("");
            txtIndirizzo.setText("");
            txtNumero.setText("");
        }
    }
}