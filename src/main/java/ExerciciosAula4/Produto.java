package ExerciciosAula4;

// Usada no exercício 7
public class Produto {
    String nome;
    double preco;

    public void exibirDetalhes() {
        System.out.println("Nome do Produto: " + this.nome);
        System.out.println("Preço: R$" + this.preco);
    }
}