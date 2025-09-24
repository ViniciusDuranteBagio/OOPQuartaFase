package Encapsulamento.pack3;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500.00, 10);

        p1.exibirInfo();

        p1.setPreco(-50);
        p1.setQtdEstoque(-5);

        p1.adicionarEstoque(5);
        p1.vender(3);
        p1.vender(20);

        p1.exibirInfo();
    }
}
