package classe.src.Exercicio_Aula_4;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa pessoa= new Pessoa("Davizinho",100);
        Aluno aluno = new Aluno("Osmar",100,11111);


        pessoa.nome= "Davizinho";
        pessoa.idade=100;


        System.out.println("Nome: " + pessoa.nome);
        System.out.println("idade: " + pessoa.idade);
        System.out.println();

        System.out.println("Nome: " + aluno.nome);
        System.out.println("idade: " + aluno.idade);
        System.out.println("Matricula: " + aluno.matricula);




    }
}
