package Prova;
/*
Crie uma classe ContaBancaria com os atributos titular e saldo.
Adicione métodos depositar(double valor) e sacar(double valor) que atualizam o saldo. O saldo nunca pode ficar negativo.
 */
public class contaBancaria {
    public String titular;
    public double saldo;

    public void metodoDepositar(double valor) {
        if (saldo >= 0) {
            saldo = saldo + valor;
            System.out.println("O saldo depositado é" + valor + "\n" + "saldo final de: " + saldo);
        } else {
            System.out.println("O saldo tem que ser positivo,nao poderá permanescer negativo");
        }
    }
        public void metodoSacar(double valor){
            if(saldo >= 0) {
                saldo = saldo - valor;
                System.out.println("O saldo sacado é" + valor + "\n" + "saldo final de: " + saldo);
            }else{
                System.out.println("O saldo tem que ser positivo,nao poderá permanescer negativo");
            }
    }

}
