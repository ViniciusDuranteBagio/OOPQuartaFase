package Aula4;

public class Funcionario {

    //atributos da classe
    private String nome;
    private int idade;
    private double salario;

    //construtor de funcionario
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //metodos getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    //metodo aumentarSalario
    public double aumentarSalario(double porcentagem){
        salario += ((porcentagem / 100) * salario);
        return salario;
    }



}
