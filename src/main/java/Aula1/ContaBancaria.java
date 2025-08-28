public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    private String titular;



// construtor
    public ContaBancaria (String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor do depósito errado");

        }
    }

    public void sacar (double valor ) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saque indisponível. Verifique seu saldo");
        }
    }
        public void exibirSaldo () {
            System.out.println("Seu saldo é de R$" + saldo);
        }


    }