package exercicios;

class Aluno2 extends Pessoa2 {
    String matricula;

    public Aluno2(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
