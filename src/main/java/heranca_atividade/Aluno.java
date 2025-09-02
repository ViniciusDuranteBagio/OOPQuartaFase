package heranca_atividade;

public class Aluno extends Pessoa{
     int matricula;

     public Aluno (String nome, int idade, int matricula){
         super(nome, idade);
         this.matricula = matricula;
     }
}
