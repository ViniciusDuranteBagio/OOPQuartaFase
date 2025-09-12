package polimorfismo.atividades.ativ3;

public class Eletronico extends Loja{

    public Eletronico(String nome, double preco, double distancia) {
        super(nome, preco, distancia);
    }

    @Override
    public double frete() {
        return distancia * 0.89;
    }
}
