package exercicio_9;

import javax.swing.*;

public class Main9 {
    public static void main(String[] args) {
        ValidadorDocumento validador = new ValidadorDocumento();

        try {
            String entrada = JOptionPane.showInputDialog("Digite o CPF:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            if (!validador.validar(entrada)) {
                throw new DocumentoInvalidoException("CPF inválido");
            }

            JOptionPane.showMessageDialog(null, "CPF válido");

        } catch (DocumentoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
