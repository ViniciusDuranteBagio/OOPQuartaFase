package Aula3;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 1 - Encapsulamento e Modificadores de Acesso:");
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Lua de Tal");
        conta1.exibirSaldo();
        conta1.depositar(2500.0);
        conta1.exibirSaldo();
        conta1.sacar(200.0);
        conta1.exibirSaldo();
        conta1.sacar(2600.0); // Tentativa de saque maior que o saldo
        System.out.println();

        System.out.println("\nEXERCÍCIO 2 - Construtores e Sobrecarga:");
        Pessoa pessoa1 = new Pessoa("Alice", 21, "111.222.333-44");
        pessoa1.exibirInformacoes();
        Pessoa pessoa2 = new Pessoa("Rafael", 32);
        pessoa2.exibirInformacoes();
        Pessoa pessoa3 = new Pessoa();
        pessoa3.exibirInformacoes();

        System.out.println("\nEXERCÍCIO 3 - Encapsulamento e Validação:");
        Produto produto1 = new Produto("Jaqueta Nike", 429.99, 3);
        produto1.setPreco(-10);
        produto1.setPreco(449.99);
        produto1.adcEstoque(2);
        produto1.adcEstoque(-5);
        produto1.vender(5);

        System.out.println("\nEXERCÍCIO 4 - Construtor e Encapsulamento:");
        Aluno aluno1 = new Aluno("Georgia", 248772);
        aluno1.setNota(8.9);
        aluno1.exibirStatus();

        System.out.println("\nEXERCÍCIO 5 - Encapsulamento e Métodos:");
        Retangulo retangulo1 = new Retangulo(3, 2);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();

        System.out.println("\nEXERCÍCIO 6 - Construtor e Encapsulamento Avançado:");
        Livro livro1 = new Livro("Morte na Mesopotâmia", "Agatha Christie", 1936);
        livro1.setAnoPublicacao(0);
        livro1.exibirDetalhes();
    }
}
