package Atividades.Aula5;

import javax.swing.*;

public class Cartao implements Pagamentos{
    private double valor;
    private String numeroCartao;

    public Cartao(double valor, String numeroCartao) {
        this.valor = valor;
        this.numeroCartao = numeroCartao;
    }
    @Override
    public void processarPagamento() {
        JOptionPane.showMessageDialog(null, "Pagamento de R$ " + valor
                + " processado com cartão " + numeroCartao);

    }
}
