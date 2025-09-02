package classe.Exercicio_Aula_2;

public class Main_Conta {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(100);
        conta.MostrarSaldo();
        conta.sacar(90);
        conta.MostrarSaldo();




    }
}
