package exercicios_13;

import javax.swing.*;

public class Main13 {
    public static void main(String[] args) {
        try {
            throw new ErroComCodigoException("Ocorreu um erro no sistema", 404);

        } catch (ErroComCodigoException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: " + e.getMessage() + "\nCódigo: " + e.getCodigo()
            );
        }
    }
}
