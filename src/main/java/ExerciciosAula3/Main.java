package ExerciciosAula3;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Criando Conta Bancária ---");
        ContaBancaria conta = new ContaBancaria("12345-6", "Carlos Silva");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Conta: " + conta.getNumeroConta());

        conta.exibirSaldo(); // Mostra saldo inicial

        System.out.println("\n--- Realizando Operações ---");
        conta.depositar(500.0);
        conta.exibirSaldo();

        conta.sacar(200.0);
        conta.exibirSaldo();

        System.out.println("\n--- Tentando Saque Inválido ---");
        conta.sacar(1000.0); // Saldo insuficiente
        conta.exibirSaldo();



        System.out.println("--- Pessoa 1 (Construtor Completo) ---");
        Pessoa p1 = new Pessoa("Ana Paula", 25, "111.222.333-44");
        p1.exibirInformacoes();

        System.out.println("\n--- Pessoa 2 (Construtor Nome/Idade) ---");
        Pessoa p2 = new Pessoa("Bruno Costa", 32);
        p2.exibirInformacoes();

        System.out.println("\n--- Pessoa 3 (Construtor Padrão) ---");
        Pessoa p3 = new Pessoa();
        p3.exibirInformacoes();



        Produto produto = new Produto();
        produto.setNome("Notebook Gamer");

        System.out.println("--- Testando Validações ---");
        produto.setPreco(-50.0); // Teste de preço inválido
        produto.setPreco(4500.0);

        produto.setQuantidadeEmEstoque(-10); // Teste de quantidade inválida
        produto.setQuantidadeEmEstoque(20);

        System.out.println("\nProduto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Estoque: " + produto.getQuantidadeEmEstoque());

        System.out.println("\n--- Operações de Estoque ---");
        produto.adicionarEstoque(5);
        System.out.println("Novo Estoque: " + produto.getQuantidadeEmEstoque());

        produto.vender(10);
        System.out.println("Novo Estoque: " + produto.getQuantidadeEmEstoque());

        produto.vender(30); // Tentativa de venda com estoque insuficiente
        System.out.println("Estoque Final: " + produto.getQuantidadeEmEstoque());


        Aluno aluno = new Aluno("Fernanda Lima", "2024-001");
        aluno.exibirStatus(); // Mostra estado inicial

        System.out.println("\n--- Atribuindo Notas ---");
        aluno.setNota(8.5);
        System.out.println("Nota atualizada para: " + aluno.getNota());

        System.out.println("\n--- Tentando atribuir nota inválida ---");
        aluno.setNota(11.0); // Teste de validação

        aluno.exibirStatus();


        Retangulo ret = new Retangulo();

        System.out.println("--- Definindo dimensões válidas ---");
        ret.setLargura(10.0);
        ret.setAltura(5.0);

        System.out.println("Largura: " + ret.getLargura());
        System.out.println("Altura: " + ret.getAltura());

        System.out.println("\n--- Cálculos ---");
        System.out.println("Área do retângulo: " + ret.calcularArea());
        System.out.println("Perímetro do retângulo: " + ret.calcularPerimetro());

        System.out.println("\n--- Tentando definir dimensões inválidas ---");
        ret.setLargura(-2.0); // Teste de validação




        System.out.println("--- Criando Livro ---");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        livro.exibirDetalhes();

        System.out.println("\n--- Tentando alterar para um ano inválido ---");
        livro.setAnoPublicacao(-100); // Teste de validação

        System.out.println("\n--- Alterando o autor ---");
        livro.setAutor("J. R. R. Tolkien");
        livro.exibirDetalhes();
    }
}