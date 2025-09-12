package polimorfismo.atividades.ativ4;

public class Pix implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("seu pix de : " + valor + " foi realizado");
    }
}
