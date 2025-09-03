package Prova;

public class Main_Funcionario {
    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        func.nome="Davi";
        func.salario=100;
        func.calcularBonus();

        Gerente gen= new Gerente();
        gen.nome="teste";
        gen.salario=200;
        gen.calcularBonus();
    }
}
