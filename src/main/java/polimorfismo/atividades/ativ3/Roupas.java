package polimorfismo.atividades.ativ3;

public class Roupas extends Loja{

    public Roupas(String nome, double preco, double distancia) {
        super(nome, preco, distancia);
    }

    @Override
    public double frete() {
        return distancia * 1.20;
    }
}
