package OOPQuartaFase.src.Prova;

public class Aluno extends Pessoa {

int matricula = 248732;

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nome + " tenho " + idade + " anos e minha matrícula é: " + matricula);
    }
}


