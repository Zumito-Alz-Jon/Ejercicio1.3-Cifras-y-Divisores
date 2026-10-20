package zumito_alz.ejercicio1.cifras.y.divisores;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML private TextField txtNumero, txtCantidad, txtImpares,
                            txtPares, txtTotal, txtMayor, txtMenor;
    @FXML private TextArea txtAdivisores;

    @FXML
    private void analizar_click() throws IOException {
        int numero = Integer.parseInt(txtNumero.getText());

        int resto = numero;
        int cantidad = 0;
        int sumaImpares = 0; 
        int sumaPares = 0;
        int mayor = 0; 
        int menor = 9;

        while (resto > 0) {
            int cifra = resto % 10;
            cantidad++;

            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }
            if (cifra > mayor) mayor = cifra;
            if (cifra < menor) menor = cifra;

            resto = resto / 10;
        }

        String divisores = "";
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores += i + "\n";
            }
        }

        txtCantidad.setText("" + cantidad);
        txtImpares.setText("" + sumaImpares);
        txtPares.setText("" + sumaPares);
        txtTotal.setText("" + (sumaImpares + sumaPares));
        txtMayor.setText("" + mayor);
        txtMenor.setText("" + menor);
        txtAdivisores.setText(divisores);
        
    }
    
    @FXML
    private void limpiar_click() throws IOException {
        txtNumero.setText("");
        txtCantidad.setText("");
        txtImpares.setText("");
        txtPares.setText("");
        txtTotal.setText("");
        txtMayor.setText("");
        txtMenor.setText("");
        txtAdivisores.setText("");
        
    }
    
}
