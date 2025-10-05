package Aula05;

public class Roupas extends Ecommerce{


    public Roupas(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String calcularFrete() {
        if (preco > 80) {
            return "Valor do frete gratis!";
        } else {
            return "R$30,00\n(Frete gratis acima de R$ 80,00!)";
        }
    }
}

