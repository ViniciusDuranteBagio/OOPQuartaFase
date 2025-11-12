package exercicios_aula_5.exercicio_3;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Livro("Diário de um Banana", 60);
        Produto p2 = new Eletronico("Motorola G5", 800);
        Produto p3 = new Roupa("Moletom", 240);

        Produto[] produtos = { p1, p2, p3 };

        for (Produto p : produtos) {
            p.exibirResumo();
        }
    }
}
