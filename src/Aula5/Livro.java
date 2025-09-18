package Aula5;

public class Livro extends Produto{
    public Livro(String nome, double preco){
        super(nome, preco);
    }
    @Override
    public double calcularFrete(){
        return 10;
    }
}
