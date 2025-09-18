package Aula5.Exercicios;

public class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularFrete() {
        return 15;
    }
}
