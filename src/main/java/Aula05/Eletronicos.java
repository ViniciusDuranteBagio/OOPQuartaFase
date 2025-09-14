package Aula05;

public class Eletronicos extends Ecommerce {

    public Eletronicos(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String calcularFrete() {
        return "Valor do frete gratis!";
    }
}

