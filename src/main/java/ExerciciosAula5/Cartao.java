package ExerciciosAula5;
public class Cartao implements FormaDePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando R$" + valor + " com Cartão de Crédito... Aprovado!");
    }
}
