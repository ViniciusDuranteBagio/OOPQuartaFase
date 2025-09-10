package atividade4;

public class main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("caua");
        System.out.println("o titular da conta é " + conta.getTitular());
        conta.depositar(100);
        conta.sacar(25);
        System.out.println("saldo final é de " + conta.getSaldo());
       }
    }

