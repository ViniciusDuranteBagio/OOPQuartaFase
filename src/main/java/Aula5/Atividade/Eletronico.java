package Aula5.Atividade;

public class Eletronico extends Produto{
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 20;
    }
}
