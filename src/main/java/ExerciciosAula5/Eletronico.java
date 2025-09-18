package ExerciciosAula5;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) { super(nome, preco); }

    @Override
    public double calcularFrete() {
        return this.preco * 0.015; // Frete de 1.5%
    }
}
