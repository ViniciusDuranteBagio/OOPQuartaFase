package Aula5;

public class Boleto implements IMetodoPagamento {
    @Override
    public void Cobrar(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor);
    }
}