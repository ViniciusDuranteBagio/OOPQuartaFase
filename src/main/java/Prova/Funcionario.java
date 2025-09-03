package Prova;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    } public void exibirDados() {
        System.out.println("Nome: " + nome + "\n" + "Idade: " + salario);

    }
    public void calcularBonus() {
        System.out.println("10% do seu salário equivale a " + salario * 0.1 +
                "\n Sendo assim, seu salário mais o acréscimo fica " + (salario + (salario * 0.1)));



    }

}
