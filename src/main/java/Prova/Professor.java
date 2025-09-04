package Prova;

public class Professor extends pessoa2{
    String diciplina;

    @Override
    void apresentar() {
        System.out.println("Olá, sou " + nome + ", e tenho " + idade + " anos e minha diciplina é "+ diciplina);
    }
}
