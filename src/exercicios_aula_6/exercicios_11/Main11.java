package exercicios_aula_6.exercicios_11;

import javax.swing.*;

public class Main11 {
    public static void main(String[] args) {
        ContaBancaria contaOrigem = new ContaBancaria(1000.0);
        ContaBancaria contaDestino = new ContaBancaria(500.0);

        try {
            String entrada = JOptionPane.showInputDialog(
                    "Saldo origem: R$ " + contaOrigem.getSaldo() +
                            "\nSaldo destino: R$ " + contaDestino.getSaldo() +
                            "\nDigite o valor para transferir:"
            );

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }

            double valor = Double.parseDouble(entrada);

            contaOrigem.transferir(contaDestino, valor);

            JOptionPane.showMessageDialog(null,
                    "Transferência realizada com sucesso\n" +
                            "Saldo origem: R$ " + contaOrigem.getSaldo() + "\n" +
                            "Saldo destino: R$ " + contaDestino.getSaldo()
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (IllegalArgumentException | ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
