package Atividades_Aula_5;


class Eletronico extends Loja {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return preco * 0.05;
    }
}