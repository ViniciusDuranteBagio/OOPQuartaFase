package Prova;
//Crie uma classe Produto com os atributos nome e preco.
//No classe main, crie dois objetos dessa classe e imprima os valores de cada um.
public class Produto {

    public String nome;
    public double preco;

    public void informacoesProduto() {
        System.out.println("Produto; " + nome + "\nValor: " + preco);
    }
}