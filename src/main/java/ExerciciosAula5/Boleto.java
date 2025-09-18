package ExerciciosAula5;

public class Boleto implements FormaDePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto de R$" + valor + "... Aguardando pagamento.");
    }
}