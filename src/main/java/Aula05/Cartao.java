package Aula05;

import java.sql.SQLOutput;

public class Cartao implements Pagamento{
    private String numeroCartao;
    private String nomeTitular;

    public Cartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com CARTAO!");
        System.out.println("Numero do cartao: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
    }
}
