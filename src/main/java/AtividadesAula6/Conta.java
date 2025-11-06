package AtividadesAula6;

public class Conta {
    private double saldo;

    public void sacar (double valor) throws SaldoInsuficienteException{
        if (valor > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }

        saldo = saldo - valor;
        System.out.println("O Saldo atual é: " + saldo);
    }

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new Conta();
        conta.sacar(200.0);
    }
}
