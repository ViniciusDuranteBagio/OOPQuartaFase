package AtividadesAula05;

public class Livro extends Produtos {

    public Livro (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Frete do livro " + nome + ": R$12,69");
    }
}
