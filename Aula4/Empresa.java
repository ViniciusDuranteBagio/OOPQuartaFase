package Aula4;

public class Empresa {
    protected String nome;
    protected String cidade;

    public Empresa(){
    }
    public Empresa(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void exibirDados(){
        System.out.println("        DADOS \nNome da Empresa: " + this.nome + "\nCidade: " + this.cidade);
    }
}
