package Atividades_Aula_5.src;

public class Gerente extends Funcionarios{

    public void Funcionarios(String nome, double salarioBase){
        super.Funcionarios(nome, salarioBase);
    }

    @Override
    double calcularSalario(double bonus) {
        salarioComBonus = salarioBase + bonus;
        return 0;
    }
}