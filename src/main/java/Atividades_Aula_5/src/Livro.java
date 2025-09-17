package Atividades_Aula_5.src;

public class Livro extends Produtos {

    public void Produtos(String nome, double preco) {
        super.Produtos(nome, preco);
    }

    @Override
    double calcularFrete(double Frete) {
        valorFrete = valorFrete + Frete;
        return valorFrete;
    }
}