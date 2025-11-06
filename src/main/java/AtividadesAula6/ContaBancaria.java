package AtividadesAula6;

import javax.swing.*;

public class ContaBancaria {
    private double saldo;

    public void sacar (double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        saldo = saldo - valor;
        System.out.println("O Saldo atual é: " + saldo);
    }

    public static void main(String[] args) throws SaldoInsuficienteException, ValorInvalidoException {
        ContaBancaria conta = new ContaBancaria();

        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor para sacar"));

        if (valor < 0){
            throw new ValorInvalidoException("Valor não pode ser negativo!");
        }

        conta.sacar(valor);

    }
}
