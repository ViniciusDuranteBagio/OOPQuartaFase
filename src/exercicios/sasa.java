package exercicios;

public class Exercicio8 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.titular = "João Silva";
        cc.saldo = 1000;
        cc.taxaManutencao = 15;
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.titular = "Maria Santos";
        cp.saldo = 2000;
        cp.taxaJuros = 0.5;
        
        cc.exibirDetalhes();
        System.out.println();
        cp.exibirDetalhes();
    }
}

