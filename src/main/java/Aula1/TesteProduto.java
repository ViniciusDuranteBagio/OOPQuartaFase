public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Notebook");
        p1.setPreco(1000);
        p1.setQtdEstoque(5);

        System.out.println("=== Produto inicial ===");
        p1.exibirProduto();

        System.out.println("\n=== Testando adicionarEstoque ===");
        p1.adicionarEstoque(5);  // estoque +5
        p1.exibirProduto();

        System.out.println("\n=== Testando vender ===");
        p1.vender(8); // estoque -8
        p1.exibirProduto();

        System.out.println("\n=== Testando erros ===");
        p1.setPreco(-100);        // preço inválido
        p1.setQtdEstoque(-5);     // estoque inválido
        p1.adicionarEstoque(-3);  // quantidade inválida
        p1.vender(100);           // maior que o estoque atual
    }
}
