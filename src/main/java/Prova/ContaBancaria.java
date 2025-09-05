package Prova;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ContaBancaria (String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
        public void depositar(double valor){
            if (valor > 0) {
                saldo += valor;
                System.out.println("depositou " +valor + " de reais");
            }else{
                System.out.println("num deu parcero");

        }
    }
        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("sacou " + valor + " de reais");
            } else {
                System.out.println("num deu parcero");
            }
        }
                public void info() {
                    System.out.println(titular);
                    System.out.println(saldo);
                }
            }
//ContaBancaria banco = new ContaBancaria("Victor", 100);
//banco.depositar(50);
//banco.info();
//banco.sacar(100);
//banco.info();
//    }
//}