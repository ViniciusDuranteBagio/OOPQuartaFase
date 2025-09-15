package AtividadesAula05;

public class Roupas extends Produtos {
    public Roupas (String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Frete da roupa " + nome + ": R$15,20");
    }
}

