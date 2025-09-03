package classe.src.Exercicio_Aula_1;

public class Herois {
    private String nome;
    private String classe;

    public Herois(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void lutar() {
        System.out.println(nome + " (" + classe + ") atacou!");
    }
}

