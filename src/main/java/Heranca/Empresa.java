package Heranca;

public class Empresa {
    protected String nome;
    protected String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Cidade: " + cidade);
    }
}