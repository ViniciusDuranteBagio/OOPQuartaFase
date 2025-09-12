package Aula5;

public class CartaoDeCredito implements MetodoPagamento{
    public void cobrar() {
        System.out.println("Verificar se o cartão é válido");
        System.out.println("Cobrar do banco");
    }
}
