package aula4;

public class Personagem {
    protected String nome;
    protected int nivel;


    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
    }
}

