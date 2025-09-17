package Atividades_Aula_5;

class Livro extends Loja {
    public Livro(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularFrete() {
        return 10.0;
    }
}
