package Prova;

public class Main_Produto {
    public static void main(String[] args) {
        Produto produto1= new Produto();
        Produto produto2= new Produto();

        produto1.nome="Carne";
        produto1.preco=10;
        produto1.exibir();

        produto2.nome="arroz";
        produto2.preco=5;
        produto2.exibir();
    }
}
