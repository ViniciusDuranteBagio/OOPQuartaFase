package Exercicios_Aula5;

public class Boleto implements IFormaPagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Escanenado código do boleto" +
                "\nProcessando valor do boleto" +
                "\nConfirmando titular da conta" +
                "\nPagamento realizado via boleto");
        System.out.println(" ");
    }
}