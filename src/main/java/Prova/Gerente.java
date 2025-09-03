package Prova;

public class Gerente extends Funcionario {

    public Gerente (String nome, double salario) {
        super(nome, salario);

    }
    @Override
    public void calcularBonus() {
        System.out.println("20% do seu salário equivale a " + salario * 0.2 +
                "\nSendo assim, seu salário mais o acréscimo fica " + (salario + (salario * 0.2)));
    }
}
