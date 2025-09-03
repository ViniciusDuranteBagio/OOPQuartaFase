package Prova;

public class Funcionario {

    String nome;
    double salario;

    public void calcularBonus(){
        salario+= salario * 0.10;
        System.out.println("Seu bonus de 10 por cento e igual a " + salario);
    }
}
