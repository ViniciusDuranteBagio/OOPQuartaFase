package Atividades.Aula5;
import javax.swing.*;

public class Boleto implements Pagamentos{
    private double valor;
    private String codigoBoleto;

    public Boleto(double valor, String codigoBoleto) {
        this.valor = valor;
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void processarPagamento() {
        JOptionPane.showMessageDialog(null, "Pagamento de R$ " + valor
                + " processado com boleto. Código: " + codigoBoleto);
    }
}
