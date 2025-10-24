package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

public class ContaBancaria {
    private double saldo = 500;

    public void transferir(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor deve ser positivo!");
        if (valor > saldo) throw new ArithmeticException("Saldo insuficiente!");

        saldo -= valor;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        try {
            double valor = Double.parseDouble(JOptionPane.showInputDialog(
                    "Saldo: R$ " + conta.saldo + "\nValor da transferência:"));

            conta.transferir(valor);
            JOptionPane.showMessageDialog(null, "Transferência realizada!\nNovo saldo: R$ " + conta.saldo);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}