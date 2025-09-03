package Prova;

public class Aluno extends Pessoa{
    int matricula;

    @Override
    public void apresentar(){
        System.out.println("Ola meu nome e " + nome + " minha idade e " + idade + " Minha matricula e " + matricula);


    }
}
