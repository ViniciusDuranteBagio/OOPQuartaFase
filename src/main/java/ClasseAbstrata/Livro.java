package ClasseAbstrata;

public class Livro extends Produto {
    private double peso; // em kg

    public Livro(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    @Override
    public double calcularFrete() {
        return peso * 5; // R$5 por kg
    }
}