public class Livro extends Produto {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return 5.0;
    }
}
