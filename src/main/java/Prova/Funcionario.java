package Prova;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularBonus() {
        System.out.println("10% do seu salário é " + salario/10 +
                "\nPortanto, seu salário com o acréscimo do bônus é " + (salario + salario/10));
    }
}
