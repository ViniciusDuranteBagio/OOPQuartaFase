package exercicio1_e_2;

public class Aluno extends Pessoa {
 public int matricula;

 public Aluno(String nome, int idade, int matricula) {
     super(nome, idade);
     this.matricula = matricula;
 }
}
