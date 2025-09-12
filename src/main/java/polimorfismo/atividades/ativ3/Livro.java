package polimorfismo.atividades.ativ3;

public class Livro extends Loja{

    public Livro(String nome, double preco, double distancia) {
        super(nome, preco, distancia);
    }

    @Override
    public double frete() {
        return distancia * 0.50;
    }
}
