package Atividades.Aula6;

import javax.swing.*;

public class ValidadorEntrada {
    public int lerNumeroPositivo() throws EntradaInvalidaException {
        String input = JOptionPane.showInputDialog("Digite um número positivo:");

        if (input == null) {
            throw new EntradaInvalidaException("Erro: Operação cancelada.");
        }

        try {
            int numero = Integer.parseInt(input);
            if (numero < 0) {
                throw new EntradaInvalidaException("Erro: O número deve ser positivo.");
            }
            return numero;
        } catch (NumberFormatException e) {
            throw new EntradaInvalidaException("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        }
    }
}
