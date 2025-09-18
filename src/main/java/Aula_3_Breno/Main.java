package Aula_3_Breno;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Breno");
        conta.setNumeroConta(1234);
        conta.depositar(1000);
        conta.sacar(500);
        conta.exibirSaldo();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Breno");
        pessoa.setIdade(23);
        pessoa.setCpf("08666047909");
        pessoa.exibirInformacoes();

        Produto produto = new Produto();
        produto.setNome("Arroz");
        produto.setPreco(1.50);
        produto.setQuantidadeEmEstoque(1000);
        produto.adicionarEstoque(1500);
        produto.vender(800);
        produto.mostrarEstoque();

        Aluno aluno = new Aluno("Breno", 2255);
        aluno.setNota(8);
        aluno.exibirStatus();

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(15);
        retangulo.setLargura(20);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        Livro livro = new Livro();
        livro.setTitulo("As Cronicas de Gelo e Fogo");
        livro.setAutor("George R. R. Martin");
        livro.setAnoPublicacao(1996);
        livro.exibirDetalhes();
    }
}