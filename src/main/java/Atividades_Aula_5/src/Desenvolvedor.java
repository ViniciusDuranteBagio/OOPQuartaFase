package Atividades_Aula_5.src;

public class Desenvolvedor extends Funcionarios {

    public void Funcionarios(String nome, double salarioBase){
        super.Funcionarios(nome, salarioBase);
    }

    @Override
    double calcularSalario(double bonus) {
        return 0;
    }
}