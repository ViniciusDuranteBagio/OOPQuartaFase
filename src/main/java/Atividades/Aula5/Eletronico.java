package Atividades.Aula5;

public class Eletronico extends Produtos{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return preco * 0.1;
    }
}
