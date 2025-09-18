package Aula5.Atividade;

public class Cartao implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        double taxa = valor * 0.02; // 2% de taxa
        double total = valor + taxa;
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão.");
        System.out.println("Taxa de 2% aplicada: R$ " + taxa);
        System.out.println("Total debitado: R$ " + total);
        System.out.println("---------------------------");
    }
}
