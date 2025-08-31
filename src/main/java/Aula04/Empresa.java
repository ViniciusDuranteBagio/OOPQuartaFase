package Aula04;

public class Empresa {
    protected String nome;
    protected String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public void imprimirInfoEmpresa() {
        System.out.println("Nome do empresa: " + this.nome);
        System.out.println("Cidade da empresa: " + this.cidade);
    }
}
