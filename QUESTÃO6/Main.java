/* 
- Crie uma classe Pessoa, com os atributos nome e idade, com um método apresentar() que fala "Olá sou {nome}, e tenho {idade} anos".
- Crie uma classe Aluno que herda de Pessoa. Adicione o atributo matricula. Sobrescreva o método apresentar() para imprimir também a matrícula.
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "João";
        aluno.idade = 20;
        aluno.setMatricula("2024001");

        aluno.apresentar();
    }
}
