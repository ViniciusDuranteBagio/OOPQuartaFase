package Aula6;

import javax.swing.*;

public class ValidadorDocumento {
    public void validarCPF() {
        boolean valido = false;
        while (!valido) {
            try {
                String cpf = JOptionPane.showInputDialog("Digite o CPF (11 números):");
                if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d{11}")) {
                    throw new DocumentoInvalidoException("CPF inválido. Deve ter 11 números.");
                }
                JOptionPane.showMessageDialog(null, "CPF válido: " + cpf);
                valido = true;
            } catch (DocumentoInvalidoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}