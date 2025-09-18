package Aula5;

class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 15.0; // fixo
    }
}