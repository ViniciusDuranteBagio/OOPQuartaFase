public class ProdutosEcommerce {
    public static void main(String[] args) {
        Livro2 livro2 = new Livro2();
        livro2.nome = "Java Programming";
        livro2.preco = 89.90;
        
        Eletronico2 eletronico2 = new Eletronico2();
        eletronico2.nome = "Smartphone";
        eletronico2.preco = 1200.00;
        
        Roupas roupa = new Roupas();
        roupa.nome = "Camiseta";
        roupa.preco = 49.90;
        
        livro2.exibirResumo();
        System.out.println();
        eletronico2.exibirResumo();
        System.out.println();
        roupa.exibirResumo();
    }
}

