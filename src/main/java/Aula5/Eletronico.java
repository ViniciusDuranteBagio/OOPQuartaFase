public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    public double calcularFrete() {
        return 20.0;
    }
}
