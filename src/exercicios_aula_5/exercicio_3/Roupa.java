package exercicios_aula_5.exercicio_3;

class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 20.0;
    }
}