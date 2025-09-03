package Prova;

public class gerente extends funcionario{
    public void calcularBonus() {
        salario = salario * 0.20;
        System.out.println("O " + " " + nome +  "\n" + "receberá o bonus de " + " " + salario);
    }
}
