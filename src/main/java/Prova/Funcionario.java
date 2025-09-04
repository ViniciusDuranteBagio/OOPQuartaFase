package Prova;

public class Funcionario{
    private String nome;
    double salario;

    protected Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    protected void  calcularBonus(){
        salario = salario * 0.10;
        System.out.println("10% do salario do funcionário é " + salario);
    }}
