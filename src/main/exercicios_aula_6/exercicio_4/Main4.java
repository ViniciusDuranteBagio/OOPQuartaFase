package exercicio_4;

import javax.swing.*;

public class Main4 {
    public static void main(String[] args) {
        Conta conta = new Conta(500.00);

        try {
            String entrada = JOptionPane.showInputDialog("Saldo atual: R$ " + conta.getSaldo() +
                    "\nDigite o valor que deseja sacar:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }

            double valorSaque = Double.parseDouble(entrada);

            conta.sacar(valorSaque);

            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nNovo saldo: R$ " + conta.getSaldo());

        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }
}
