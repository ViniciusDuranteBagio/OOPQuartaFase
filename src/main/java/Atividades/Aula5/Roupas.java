package Atividades.Aula5;

public class Roupas extends Produtos{
    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 15.0;
    }
}
