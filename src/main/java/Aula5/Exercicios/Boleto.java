package Aula5.Exercicios;

public class Boleto implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto de R$" + valor + " gerado.");
    }
}