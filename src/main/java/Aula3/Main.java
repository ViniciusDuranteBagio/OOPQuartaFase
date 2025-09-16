package Aula3;

public class Main {
    public static void main(String[] args) {

        // Exercício 1: ContaBancaria
        System.out.println("Exercício 1 - ContaBancaria\n");
        ContaBancaria conta = new ContaBancaria("12345", "Tiago Fernandes");
        conta.exibirSaldo();
        conta.depositar(1000.0);
        conta.exibirSaldo();
        conta.sacar(500.0);
        conta.exibirSaldo();
        conta.sacar(1000.0);

        System.out.println("\n");
        
        // Exercício 2: Pessoa
        System.out.println("Exercício 2 - Pessoan\n");
        Pessoa pessoa1 = new Pessoa("Tiago", 19, "113.347.229-00");
        pessoa1.exibirInformacoes();
        
        Pessoa pessoa2 = new Pessoa("Jotapê", 30);
        pessoa2.exibirInformacoes();
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.exibirInformacoes();

        System.out.println("\n");
        
        // Exercício 3: Produto
        System.out.println("Exercício 3 - Produto:\n");
        Produto produto = new Produto("PS5", 4000.0, 10);
        produto.exibirInformacoes();
        produto.setPreco(-5000.0);
        produto.setPreco(3500.0);
        produto.adicionarEstoque(5);
        produto.vender(3);
        produto.vender(30);
        produto.exibirInformacoes();

        System.out.println("\n");
        
        // Exercício 4: Aluno
        System.out.println("Exercício 4 - Aluno:\n");
        Aluno aluno = new Aluno("Tiago Fernandes", "18765434");
        aluno.exibirStatus();
        aluno.setNota(5.5);
        aluno.setNota(11.0);
        aluno.setNota(10.0);
        aluno.exibirStatus();

        System.out.println("\n");
        
        // Exercício 5: Retangulo
        System.out.println("Exercício 5 - Retangulo:\n");
        Retangulo retangulo = new Retangulo(4.0, 4.0);
        retangulo.exibirInformacoes();
        retangulo.setLargura(-30.0);
        retangulo.setLargura(10.0);
        retangulo.setAltura(8.0);
        retangulo.exibirInformacoes();

        System.out.println("\n");
        
        // Exercício 6: Livro
        System.out.println("Exercício 6 - Livro:\n");
        Livro livro = new Livro("Guerra Civil", "Stuart Moore", 2014);
        livro.exibirDetalhes();
        livro.setAnoPublicacao(-1);
        livro.setAnoPublicacao(2000);
        livro.exibirDetalhes();
    }
}
