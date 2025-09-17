package Prova;

public class Produto {
   private String nome;
  private double preço;

    public Produto(String nome, double preço) {
            this.nome= nome;
            this.preço=preço;
    }
    public void MostrarProdutos(){
        System.out.println("Produto selecionado:\n"+"Nome: "+nome+
                "\nValor: "+preço);
    }
}
