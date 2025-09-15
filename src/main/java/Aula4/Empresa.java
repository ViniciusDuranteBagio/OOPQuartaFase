package Aula4;

public class Empresa {
    private String nome;
    private String cidade;

    public Empresa(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void exibir(){
        System.out.println("Nome: " + getNome() +
                "\nCidade: " + getCidade());
    }

}
