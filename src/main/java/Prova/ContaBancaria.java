package Prova;

public class ContaBancaria {
    private double saldo;
    private String Titular;

    public ContaBancaria(String Titular,double saldo){
        this.saldo=saldo;
        this.Titular= Titular;
    }
    public String getTitular() {
        return Titular;
    }
    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void Depositar( double vlDeposito){
        if (vlDeposito>0){
            saldo+= vlDeposito;
            System.out.println("Depósito realizado com sucesso no valor de "+vlDeposito+
                    "\nO saldo atual é de "+saldo);
        }else {
            System.out.println("Valor inadequado par o depósito!");
        }
    }
    public void Sacar(double vlSaque){
        if (vlSaque <=saldo && vlSaque>0){
            saldo-=vlSaque;
            System.out.println("Saque no valor de "+vlSaque+" realizado com sucesso!");
        }else if(vlSaque>saldo){
            System.out.println("Impossivel realizar o saque! Saldo insuficiente.");
        }else {
            System.out.println("Impossivel realizar o saque! Valor invalido.");
        }
    }
}
