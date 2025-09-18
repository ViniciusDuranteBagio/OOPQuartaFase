package Aula5.Atividade;

public class Pix implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
        System.out.println("Transferência instantânea sem taxa.");
        System.out.println("---------------------------");
    }

}
