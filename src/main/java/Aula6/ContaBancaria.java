package Atvd_aula6;

public class ContaBancaria {
    double saldo = 100.0;

    public void depositar(double valor){
        try {
            if ( valor <  0){
                throw new DepositoInvalidoException("Valor inválido.");
            }
            saldo += valor;
            System.out.println("depósito realizado, seu saldo é de: "+ saldo);
        }catch (DepositoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
    public void  sacar(double valor){
        try {
            if( valor> saldo){
                throw new SaldoInsuficienteException("Saldo insuficiente.");
            }
            saldo -= valor;
            System.out.println("Saque realizado, seu saldo é de: "+ saldo);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

}
