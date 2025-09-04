package Prova;

public class Funcionario {
    protected String nome;
    protected double salario;
    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }
    public void calcularBonus(){
        System.out.println(salario*0.1);
    }
}
