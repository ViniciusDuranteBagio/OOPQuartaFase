package classe.src.Exercicio_Aula_2;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Davi",112334);
        aluno.ExibirInformacoes();
        aluno.setNota(6);
        aluno.ExibirInformacoes();
        System.out.println(aluno.getNota());
    }
}
