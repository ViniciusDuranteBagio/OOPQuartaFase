package ExerciciosAula4;

// Usada no exercício 10
public class Loja extends Empresa {
    String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        // Chama o construtor da superclasse (Empresa)
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }
}