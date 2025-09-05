package Prova;

public class Produto {
   private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }



    public void info(){
        System.out.println(nome);
        System.out.println(preco);
    }

}


//Produto p1 = new Produto("cupnoodles", 14.50);
//    Produto p2 = new Produto("a verdade", 9999.99);
//p1.info();
//p2.info();