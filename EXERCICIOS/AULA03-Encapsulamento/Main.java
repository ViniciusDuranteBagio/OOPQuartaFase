public class Main {
    public static void main(String[] args) {

       /*==== Exercício 1 - ContaBancaria =====*/
        ContaBancaria conta = new ContaBancaria("12345-6", "João");
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();

       /*==== Exercício 2 - Pessoa =====*/
        Pessoa pessoa1 = new Pessoa("Maria", 30, "123.456.789-00");
        pessoa1.exibirInformacoes();

        Pessoa pessoa2 = new Pessoa("Carlos", 25); // CPF "Desconhecido"
        pessoa2.exibirInformacoes();

        Pessoa pessoa3 = new Pessoa(); // Construtor padrão
        pessoa3.exibirInformacoes();

        /* ===== Exercício 3 - Produto =====*/
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3500);
        produto.setQuantidadeEmEstoque(10);
        produto.adicionarEstoque(5);
        produto.vender(3);
        System.out.println("Produto: " + produto.getNome() +
                " | Preço: " + produto.getPreco() +
                " | Estoque: " + produto.getQuantidadeEmEstoque());

       /*==== Exercício 4 - Aluno =====*/
        Aluno aluno = new Aluno("Ana", "2023001");
        aluno.setNota(9.5);
        aluno.exibirStatus();

       /*==== Exercício 5 - Retangulo =====*/
        Retangulo ret = new Retangulo();
        ret.setLargura(5);
        ret.setAltura(10);
        System.out.println("Área do retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro());

       /*==== Exercício 6 - Livro =====*/
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        livro.exibirDetalhes();
    }
}
