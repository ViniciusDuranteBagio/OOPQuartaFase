package ExerciciosAula5;

public class Roupa extends Produto {
    public Roupa(String nome, double preco) { super(nome, preco); }

    @Override
    public double calcularFrete() {
        double freteCalculado = this.preco * 0.01;
        return Math.max(freteCalculado, 15.0); // 1% com mínimo de R$15
    }
}
