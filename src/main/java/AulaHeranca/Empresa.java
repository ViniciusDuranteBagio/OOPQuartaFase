package AulaHeranca;

public class Empresa {

    String nome;
    String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    public void exibirDados() {
        System.out.println("Nome empresa: " + nome);
        System.out.println("Cidade atuante: " + cidade);
    }
}
