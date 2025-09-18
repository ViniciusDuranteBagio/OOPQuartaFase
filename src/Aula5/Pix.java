package Aula5;

public class Pix implements IMetodoPagamento{
    @Override
    public void Cobrar(double valor) {
        System.out.println("Pagamento via Pix no valor de R$ " + valor);
    }
}
