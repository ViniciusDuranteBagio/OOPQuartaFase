package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class ValidadorDocumento {
    public void validarCPF(String cpf) throws DocumentoInvalidoException {
        if (cpf == null || cpf.length() != 11) {
            throw new DocumentoInvalidoException("CPF deve ter 11 dígitos!");
        }
    }

    public static void main(String[] args) {
        ValidadorDocumento validador = new ValidadorDocumento();

        try {
            String cpf = JOptionPane.showInputDialog("Digite o CPF (apenas números):");
            validador.validarCPF(cpf);
            JOptionPane.showMessageDialog(null, "CPF válido!");

        } catch (DocumentoInvalidoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}