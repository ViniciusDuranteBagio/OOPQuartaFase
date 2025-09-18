package Aula5;

public class CartaoCredito implements IMetodoPagamento{
    @Override
    public void Cobrar(double valor){
        System.out.println("Pedir os dados do cartão");
        System.out.println("Verificou se o cartão é valido");
        System.out.println("Mandou cobrar do banco");
    }
}
