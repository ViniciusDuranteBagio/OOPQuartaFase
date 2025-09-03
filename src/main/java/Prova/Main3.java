package Prova;

public class Main3 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Papel toalha";
        p1.preco = 9;
        Produto p2 = new Produto();
        p2.nome = "Capacete";
        p2.preco = 150;

        System.out.println("Produto 1 é o " + p1.nome + " e custa R$" + p1.preco);
        System.out.println("Produto 2 é o " + p2.nome + " e custa R$" + p2.preco);
    }
}
