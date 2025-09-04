package Prova;

public class Funcionario {
    Double salario = 1500.00;
    String nome = "Wigga";
    double salarioFinal;


    public void bonus(){
        salarioFinal = salario*1.1;
        System.out.println("nome funcionario: " + nome);
        System.out.println("Salario final: " + salarioFinal);

    }
}
