package Prova;

public class Professor  extends Pessoa{
    String disciplina = "POO";

    @Override
    public void apresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Disciplina: "+disciplina);
        System.out.println("Idade: "+idade);

    }


}
