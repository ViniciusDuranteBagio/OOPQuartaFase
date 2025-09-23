package Aula4.exercicio7;
public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes(){
        System.out.println("Nome = " + nome + "\nPreço = " + preco);
    }
}