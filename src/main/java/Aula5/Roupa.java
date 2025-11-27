public class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return 10.0;
    }
}
