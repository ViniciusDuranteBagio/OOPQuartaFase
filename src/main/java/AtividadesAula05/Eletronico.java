package AtividadesAula05;

public class Eletronico extends Produtos {

    public Eletronico (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Frete do eletrônico " + nome + ": R$32,50");
    }
}

