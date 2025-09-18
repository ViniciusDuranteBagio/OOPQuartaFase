package Aula3.Exercicios;

public class Main {  public static void main(String[] args) {

    System.out.println("Questão 1");
        ContaBancaria conta = new ContaBancaria("12345", "João", 500);
            conta.exibirSaldo();
            conta.depositar(200);
            conta.exibirSaldo();
            conta.sacar(100);
            conta.exibirSaldo();
            conta.sacar(700);

    System.out.println("\nQuestão 2");
        Pessoa p1 = new Pessoa("Otavio", 21, "167.248.726-12");
        Pessoa p2 = new Pessoa("Victor", 41);
        Pessoa p3 = new Pessoa();

        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();

    System.out.println("\nQuestão 3");
        Produto prod = new Produto();
            prod.setNome("Notebook");
            prod.setPreco(3500);
            prod.setQuantidadeEmEstoque(10);

    System.out.println("Produto: " + prod.getNome() + " | Preço: " + prod.getPreco() + " | Estoque: " + prod.getQuantidadeEmEstoque());
        prod.adicionarEstoque(5);
        prod.vender(3);
    System.out.println("Estoque após operações: " + prod.getQuantidadeEmEstoque());

    System.out.println("\nQuestão 4");
        Aluno aluno = new Aluno("Mariana", "2025A01");
            aluno.setNota(9.5);
            aluno.exibirStatus();
            aluno.setNota(12);

    System.out.println("\nQuestão 5");
        Retangulo ret = new Retangulo();
            ret.setAltura(5);
            ret.setLargura(10);
    System.out.println("Área: " + ret.calcularArea());
    System.out.println("Perímetro: " + ret.calcularPerimetro());

    System.out.println("\nQuestão 6");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
            livro.exibirDetalhes();
            livro.setAnoPublicacao(-200);

    }
}