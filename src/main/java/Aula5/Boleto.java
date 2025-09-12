package Aula5;

public class Boleto implements MetodoPagamento{
    @Override
    public void cobrar() {
        System.out.println("Gerar o boleto");
    }
}
