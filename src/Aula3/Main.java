package Aula3;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS DE ENCAPSULAMENTO E CONSTRUTORES ===\n");
        
        // Exercício 1: ContaBancaria
        System.out.println("EXERCÍCIO 1 - ContaBancaria:");
        ContaBancaria conta = new ContaBancaria("12345-6", "João Silva");
        conta.exibirSaldo();
        conta.depositar(1000.0);
        conta.exibirSaldo();
        conta.sacar(300.0);
        conta.exibirSaldo();
        conta.sacar(800.0); // Tentativa de saque maior que o saldo
        System.out.println();
        
        // Exercício 2: Pessoa
        System.out.println("EXERCÍCIO 2 - Pessoa:");
        Pessoa pessoa1 = new Pessoa("Maria Santos", 25, "123.456.789-00");
        pessoa1.exibirInformacoes();
        
        Pessoa pessoa2 = new Pessoa("Pedro Costa", 30);
        pessoa2.exibirInformacoes();
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.exibirInformacoes();
        System.out.println();
        
        // Exercício 3: Produto
        System.out.println("EXERCÍCIO 3 - Produto:");
        Produto produto = new Produto("Notebook", 2500.0, 10);
        produto.exibirInformacoes();
        produto.setPreco(-100.0); // Teste de validação
        produto.setPreco(2300.0);
        produto.adicionarEstoque(5);
        produto.vender(3);
        produto.vender(20); // Tentativa de venda maior que estoque
        produto.exibirInformacoes();
        System.out.println();
        
        // Exercício 4: Aluno
        System.out.println("EXERCÍCIO 4 - Aluno:");
        Aluno aluno = new Aluno("Ana Oliveira", "2023001");
        aluno.exibirStatus();
        aluno.setNota(8.5);
        aluno.setNota(15.0); // Teste de validação
        aluno.setNota(7.0);
        aluno.exibirStatus();
        System.out.println();
        
        // Exercício 5: Retangulo
        System.out.println("EXERCÍCIO 5 - Retangulo:");
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        retangulo.exibirInformacoes();
        retangulo.setLargura(-2.0); // Teste de validação
        retangulo.setLargura(6.0);
        retangulo.setAltura(4.0);
        retangulo.exibirInformacoes();
        System.out.println();
        
        // Exercício 6: Livro
        System.out.println("EXERCÍCIO 6 - Livro:");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        livro.exibirDetalhes();
        livro.setAnoPublicacao(-100); // Teste de validação
        livro.setAnoPublicacao(1955);
        livro.exibirDetalhes();
        System.out.println();
        
        System.out.println("=== FIM DOS EXERCÍCIOS ===");
    }
}
