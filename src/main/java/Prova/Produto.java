package Prova;

public class Produto {
    private  String nome;
    private  double preco;

    public Produto(String nomeInical, double precoIncial) {
        this.nome = nomeInical;
        this.preco = precoIncial;
    }
    public void exibirDados(){

        System.out.println("Nome do produto: "+nome+"\nValor do produto:R$ "+preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
