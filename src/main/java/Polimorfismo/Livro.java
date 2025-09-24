package Polimorfismo;

import javax.swing.*;

public class Livro extends Produtos {
    int qtdLivro;
    protected Livro(String nome, double preco ,  int qtdLivro) {
        super(nome, preco);
        this.qtdLivro = qtdLivro;
    }

    @Override
    public double calcularFrete() {
        return qtdLivro * 0.5;
    }
}
