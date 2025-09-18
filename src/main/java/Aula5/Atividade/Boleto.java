package Aula5.Atividade;

public class Boleto implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " gerado via Boleto.");
        System.out.println("Prazo para pagamento: 3 dias úteis.");
        System.out.println("---------------------------");
    }
}
