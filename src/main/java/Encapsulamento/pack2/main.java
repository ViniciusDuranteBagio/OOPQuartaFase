package Encapsulamento.pack2;

public class main {
    public static void main(String[] args) {
        pessoa p1 = new pessoa("João Silva", 30, "123.456.789-00");

        pessoa p2 = new pessoa("Maria Oliveira", 25);

        pessoa p3 = new pessoa();

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}