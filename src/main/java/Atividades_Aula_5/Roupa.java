package Atividades_Aula_5;

class Roupa extends Loja {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 7.0;
    }
}

