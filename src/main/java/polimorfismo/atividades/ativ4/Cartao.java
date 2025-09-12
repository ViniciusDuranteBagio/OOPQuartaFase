package polimorfismo.atividades.ativ4;

public class Cartao implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("sua compra no valor de : " + valor + " foi aprovada!!");
    }
}
