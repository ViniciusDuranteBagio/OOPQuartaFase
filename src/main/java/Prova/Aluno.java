package Prova;

public class Aluno  extends Pessoa{
    Integer matricula = 12345;

    @Override
    public void apresentar() {
        System.out.println("Nome aluno" + super.nome);
        System.out.println("Matricula: " + matricula);

    }
}
