package Prova;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        System.out.println("20% do seu salário é " + salario/5 +
                "\nPortanto, seu salário com o acréscimo do bônus é " + (salario + salario/5));
    }
}
