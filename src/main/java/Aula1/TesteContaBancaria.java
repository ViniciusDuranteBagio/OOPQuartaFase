public class TesteContaBancaria
{
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123", "Babs");
        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();

        System.out.println(conta.getNumeroConta());
    }
}
