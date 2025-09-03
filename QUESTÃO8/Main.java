/* 
- Classe Pessoa com atributos nome e idade e método apresentar().
- Classe Aluno que herda de Pessoa, adiciona matricula e sobrescreve apresentar().
- Classe Professor que herda de Pessoa, adiciona disciplina e sobrescreve apresentar().
*/

class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

class Aluno extends Pessoa {
    String matricula;

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Minha matrícula é " + matricula + ".");
    }
}

class Professor extends Pessoa {
    String disciplina;

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Eu ensino " + disciplina + ".");
    }
}


public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.matricula = "2024001";
        aluno.apresentar();

        System.out.println();

        Professor prof = new Professor();
        prof.nome = "Carlos";
        prof.idade = 40;
        prof.disciplina = "Matemática";
        prof.apresentar();
    }
}
