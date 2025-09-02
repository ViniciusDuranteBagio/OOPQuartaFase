package exercicio1_e_2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("José", 19, 12345); //Declarações do Exercício 2
        aluno.nome = "José";
        aluno.idade = 19;
        aluno.matricula = 12345;
        //Declarações do Exercício 1
        System.out.println("O aluno " + aluno.nome + " de matrícula " + aluno.matricula + " tem " + aluno.idade + " anos");
    }
}
