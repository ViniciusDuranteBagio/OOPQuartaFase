/* Classe ContaBancaria com atributos titular e saldo, 
   métodos depositar e sacar que atualizam o saldo e garantem que não fique negativo.
*/

class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Darlon";

      
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(400); 
        conta.depositar(-50);
    }
}
