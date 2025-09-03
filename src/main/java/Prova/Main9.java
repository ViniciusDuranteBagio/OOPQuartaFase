package Prova;

public class Main9 {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.nome = "João";
        func1.salario = 3000.0;

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Maria";
        gerente1.salario = 5000.0;

        System.out.println(func1.nome + " recebeu bônus de R$ " + func1.calcularBonus());
        System.out.println(gerente1.nome + " recebeu bônus de R$ " + gerente1.calcularBonus());
    }
}
