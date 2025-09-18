package Aula5.Exercicios;

public class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double calcularFrete() {
        return preco * 0.05;
    }
}