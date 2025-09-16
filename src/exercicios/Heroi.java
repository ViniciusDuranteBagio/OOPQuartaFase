package exercicios;

public class Heroi {
    private String nome;
    private String classe;

    public Heroi(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void lutar() {
        System.out.println("O herói " + nome + " da classe " + classe + " atacou!");
    }
}
