package Prova;

public class Professora extends Pessoa{
    public String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e dou aula de "+ disciplina);
    }
}
