package atividade3;

public class main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "celular";
        produto1.preco = 479.90;
        System.out.println("preço : " + produto1.preco +
                "\nnome : " + produto1.nome);

        produto2.nome = "televisor";
        produto2.preco = 199.90;
        System.out.println("preço : " + produto2.preco +
                "\nnome : " + produto2.nome);
    }
}
