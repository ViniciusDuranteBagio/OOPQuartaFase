package Aula4.Exercicios;

public class Empresa {
    public String nome;
    public String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void exibirDados() {
        System.out.println("Empresa: " + nome + " | Cidade: " + cidade);
    }
}