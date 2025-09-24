package org.AtividadesPOO2;
//Atividade09 HerançaAula04
public class Personagem {
    private String nome;
    private int nivel;

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

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
    }
}

    class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro(String nome, int nivel, int forca) {
        super(nome, nivel);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Força: " + forca);
        System.out.println("-------------------------");
    }
}

    class Mago extends Personagem {
    private int mana;

    public Mago(String nome, int nivel, int mana) {
        super(nome, nivel);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Mana: " + mana);
        System.out.println("-------------------------");
    }
}