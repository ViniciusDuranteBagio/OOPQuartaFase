package polimorfismo.atividades.ativ3;

public abstract class Loja {

    String nome;
    double preco;
    double distancia;

    public Loja(String nome, double preco, double distancia){
        this.nome = nome;
        this.preco = preco;
        this.distancia = distancia;
    }

    public abstract double frete();

    public void exibirResumo(){
        System.out.println("nome : " + nome + "\npreço : " + preco + "\nfrete : " + frete());
    }
}
