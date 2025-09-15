package exercicio_2;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("ABC-1234", "Fiat Uno");
        Veiculo v2 = new Moto("DEF-5678", "Honda CG");
        Veiculo v3 = new Caminhao("GHI-9900", "Volvo FH");

        Veiculo[] veiculos = { v1, v2, v3 };

        for (Veiculo v : veiculos) {
            v.ligarMotor();
            v.abastecer();
            v.exibirDados(100);
        }
    }
}
