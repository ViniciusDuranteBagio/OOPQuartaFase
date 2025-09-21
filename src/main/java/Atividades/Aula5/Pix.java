package Atividades.Aula5;

import javax.swing.*;

public class Pix implements Pagamentos {
    private double valor;
    private String chavePix;

    public Pix(double valor, String chavePix) {
        this.valor = valor;
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        JOptionPane.showMessageDialog(null, "Pagamento de R$ " + valor
                + " processado com Pix. Chave: " + chavePix);
    }
}
