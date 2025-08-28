package org.example.aula03;

public class Main {
    public static void main(String[] args) {

        System.out.println("===== ATIVIDADE 1 – ContaBancaria =====");
        ContaBancaria conta = new ContaBancaria(1717);

        conta.setTitular("Renan Lucktemberg");
        System.out.println("Numero da conta: " + conta.getNumeroConta());
        System.out.println("Titular: " + conta.getTitular());

        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(300);

        System.out.println("\n===== ATIVIDADE 2 – Pessoa =====");
        Pessoa pessoa1 = new Pessoa("Renan Lucktemberg", 20, "095.245.009-76");
        Pessoa pessoa2 = new Pessoa("Luiz Otaviano", 69);
        Pessoa pessoa3 = new Pessoa();

        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
        pessoa3.exibirInformacoes();

        System.out.println("\n===== ATIVIDADE 3 – Produto =====");
        Produto produto1 = new Produto("Qboa", 10.5, 500);
        Produto produto2 = new Produto("Omo", 22, 1000);
        Produto produto3 = new Produto("Dove", 2.79, 738);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        produto3.exibirInformacoes();

        produto1.adicionarEstoque(345);
        produto2.vender(1002);
        produto3.vender(737);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        produto3.exibirInformacoes();

        System.out.println("\n===== ATIVIDADE 4 – Aluno =====");
        Aluno aluno1 = new Aluno("Joel", 3568);
        Aluno aluno2 = new Aluno("Lucas", 8532);
        Aluno aluno3 = new Aluno("Thomaz", 6878);

        aluno1.exibirStatus();
        aluno2.exibirStatus();
        aluno3.exibirStatus();

        aluno1.setNota(10);
        aluno2.setNota(56);
        aluno3.setNota(6.9);

        aluno1.exibirStatus();
        aluno2.exibirStatus();
        aluno3.exibirStatus();

        System.out.println("\n===== ATIVIDADE 5 – Retangulo =====");
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(20);
        retangulo.setLargura(34);

        retangulo.calcularPerimetro();
        retangulo.calcularArea();

        retangulo.exibirMedidas();

        System.out.println("\n===== ATIVIDADE 6 – Livro =====");
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        Livro livro2 = new Livro("Pai Pobre, Pai Rico", "Robert Kiyosaki", 1997);
        Livro livro3 = new Livro("Trancas de um careca", "Nemo", -3451);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();
    }
}