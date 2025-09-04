package Prova;

public class Produto {
    //Crie uma classe Produto com os atributos nome e preco. 
    // No classe main, crie dois objetos dessa classe e imprima os valores de cada um.
    //(se vai imprimir, to supondo aqui que ja quer q atribua valor a eles)

    String nomeProduto;
    int precoProduto;

    public void exibirProduto() {
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Preço: R$ " + precoProduto);
    }

    public String getNome() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return precoProduto;
    }

    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }
}