package Aula05;

public class Livro extends Ecommerce {


    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String calcularFrete() {
        if (preco > 40) {
            return "Valor do frete gratis!";
        } else {
            return "R$10,00\n(Frete gratis acima de R$ 40,00!)";
        }
    }
}
