package ExercsEncapsulamento;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(123);
        conta1.exibirSaldo();
        conta1.depositar(-5);
        conta1.exibirSaldo();
        conta1.sacar(40);
        conta1.exibirSaldo();
        conta1.sacar(6);

        Pessoa pessoa1 = new Pessoa("Jonas",20,"111.222.333-44");
        pessoa1.exibirInformacoes();
        Pessoa pessoa2 = new Pessoa("Jonas", 20);
        pessoa2.exibirInformacoes();
        Pessoa pessoa3 = new Pessoa();
        pessoa3.exibirInformacoes();

        Produto produto1 = new Produto();
        produto1.setNome("Borracha");
        produto1.setPreco(2.50);
        produto1.setQuantidadeEmEstoque(10);
        produto1.adicionarEstoque(3);
        produto1.exibirEstoque();
        produto1.vender(4);
        produto1.exibirEstoque();

        Aluno2 aluno2 = new Aluno2("Jonas",2436);
        aluno2.setNota(7.5);
        aluno2.exibirStatus();

        Retangulo retangulo1 = new Retangulo();
        retangulo1.setAltura(10);
        retangulo1.setLargura(20);
        retangulo1.calcularArea();
        retangulo1.calcularPerimetro();

        Livro livro1 = new Livro("A revolução dos bichos", "George Orwell", 1945);
        livro1.exibirDetalhes();
    }
}
