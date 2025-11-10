package AtividadesAula8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){
        if (valor > 0) {
            saldo = saldo - valor;
            return saldo;
        } else return saldo;
    }
}
