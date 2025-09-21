package Atividades.Aula5;

public class Livro extends  Produtos{

    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 10;
    }
}
