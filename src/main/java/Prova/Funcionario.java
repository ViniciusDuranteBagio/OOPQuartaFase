package Prova;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }
    public double CalcularBonus(){
        return salario*0.10;
    }

}
