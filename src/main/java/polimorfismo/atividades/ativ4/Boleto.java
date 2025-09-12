package polimorfismo.atividades.ativ4;

public class Boleto implements IPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("seu boleto no valor de " + valor + " foi gerado com secesso!!");
    }
}
