package Atividades.Aula4;

public class ContaBancaria {

    protected String titular;
    protected double salario;

    ContaBancaria(String titular, double salario){
        this.salario = salario;
        this.titular =  titular;
    }


   public void exibirDetalhes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + salario);
    }
}
