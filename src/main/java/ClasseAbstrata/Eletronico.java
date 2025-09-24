package ClasseAbstrata;

public class Eletronico extends Produto {
    private double seguro; // custo adicional

    public Eletronico(String nome, double preco, double seguro) {
        super(nome, preco);
        this.seguro = seguro;
    }

    @Override
    public double calcularFrete() {
        return 20 + seguro; // taxa fixa + seguro
    }
}