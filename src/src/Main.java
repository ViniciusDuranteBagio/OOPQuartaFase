import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String titular = JOptionPane.showInputDialog("Digite o nome do titular:");
        ContaBancaria conta = new ContaBancaria(numero, titular);

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Olá " + conta.getTitular() + ", que ação deseja realizar?\n" +
                            "1 - Depositar\n" +
                            "2 - Sacar\n" +
                            "3 - Exibir Saldo\n" +
                            "4 - Sair"));

            switch (opcao) {
                case 1:
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.exibirSaldo();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 4);




        Pessoa p1 = new Pessoa("Kimi", 30, "123.456.789-00");

        Pessoa p2 = new Pessoa("Fernando", 25);

        Pessoa p3 = new Pessoa();


        p1.exibirInformacoes();
        System.out.println("----");
        p2.exibirInformacoes();
        System.out.println("----");
        p3.exibirInformacoes();



        Produto produto = new Produto();
        produto.setNome(JOptionPane.showInputDialog("Digite o nome do produto:"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        produto.setPreco(preco);
        int estoqueInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade inicial em estoque:"));
        produto.setQuantidadeEmEstoque(estoqueInicial);

        int opcao1;
        do {
            opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "O que deseja fazer?\n" +
                            "1 - Adicionar ao estoque\n" +
                            "2 - Vender produto\n" +
                            "3 - Exibir informações do produto\n" +
                            "4 - Sair"
            ));

            switch (opcao1) {
                case 1:
                    int qtdAdicionar = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a adicionar:"));
                    produto.adicionarEstoque(qtdAdicionar);
                    break;

                case 2:
                    int qtdVender = Integer.parseInt(JOptionPane.showInputDialog("Quantidade a vender:"));
                    produto.vender(qtdVender);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Produto: " + produto.getNome() + "\n" +
                                    "Preço: R$ " + produto.getPreco() + "\n" +
                                    "Estoque: " + produto.getQuantidadeEmEstoque());
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }

        } while (opcao1 != 4);

        Aluno aluno = new Aluno("Roger", 123456);
        aluno.setNota(8);
        aluno.exibirStatus();

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(15);
        retangulo.setLargura(10);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        JOptionPane.showMessageDialog(null, "A área é " + retangulo.calcularArea() + " e o perímetro é " +
                retangulo.calcularPerimetro());

        Livro livro = new Livro("Diário de um banana", "Jeff Kinney", 2007);
        livro.exibirDetalhes();

    }
}
