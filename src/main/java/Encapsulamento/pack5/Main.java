package Encapsulamento.pack5;

public class Main {
    public static void main(String[] args) {
        // Criando retângulos
        Retangulo r1 = new Retangulo(5, 3);
        Retangulo r2 = new Retangulo();

        // Exibindo informações
        r1.exibirInformacoes();
        r2.exibirInformacoes();

        // Alterando valores
        r2.setLargura(4);
        r2.setAltura(2);

        r2.exibirInformacoes();

        // Tentativa inválida
        r2.setAltura(-10); // mensagem de erro
    }
}