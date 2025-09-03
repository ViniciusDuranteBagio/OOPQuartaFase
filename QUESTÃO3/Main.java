/*Crie uma classe Produto com os atributos nome e preco. No classe main, crie dois objetos dessa classe e imprima os valores de cada um.
 */

class Produto {
    String nome;
    double preco;
}
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 2500.00;

        Produto produto2 = new Produto();
        produto2.nome = "Celular";
        produto2.preco = 1500.00;

        System.out.println("Produto 1: " + produto1.nome + ", Preço: R$" + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + ", Preço: R$" + produto2.preco);
    }
}