package ExerciciosAula4;

// Usada no exercício 7
public class Eletronico extends Produto {
    int garantiaEmMeses;

    // Sobrescrevendo o método da superclasse
    @Override
    public void exibirDetalhes() {
        // Chama o método original da classe Produto
        super.exibirDetalhes();
        // Adiciona a informação específica de Eletronico
        System.out.println("Garantia: " + this.garantiaEmMeses + " meses");
    }
}