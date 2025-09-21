package Atividades.Aula4;

public class Funcionario {

        protected String nome;
        protected double salario;

    Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    protected double aumentarSalario(double porcentagem){
        salario = salario + (salario * (porcentagem/100));
        return salario;
    }
}
