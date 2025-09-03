package Prova;

public class Professor extends Pessoa{
    String diciplina;

    @Override
    public void apresentar(){
        System.out.println("Ola meu nome e " + nome + " minha idade e " + idade + " Minha diciplina e " + diciplina);
    }

}
