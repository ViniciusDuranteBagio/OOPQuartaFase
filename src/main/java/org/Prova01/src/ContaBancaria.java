public class ContaBancaria {
    private String titular;
    private double saldo = 0;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    private String getTitular() {
        return titular;
    }

    private double getSaldo() {
        return saldo;
    }

    public void Depositar(double valor){
        saldo += valor;
    }
    public void Sacar(double valor){
        if (valor > saldo){
            System.out.println("Valor de saque excede o saldo.");
        } else {
            saldo -= valor;
        }
    }
    public void mostarSaldo(){
        System.out.println("Titular: " + getTitular() +
                "\nSaldo: " + getSaldo());
    }

}
