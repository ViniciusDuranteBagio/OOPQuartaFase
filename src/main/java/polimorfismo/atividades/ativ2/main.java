package polimorfismo.atividades.ativ2;

public class main {
    public static void main(String[] args) {

        Veiculo carro = new Carro("fdsa-789", "uno", 740, 30.5);
        Veiculo moto = new Moto("fdsa-789", "cg150", 540, 13.2);
        Veiculo caminhao = new Caminhao("gt3k-143", "scania", 1246.35, 234);

        carro.ligarMotor();
        carro.abastecer();
        System.out.println("o consumo foi de : " + carro.calcularConsumo());

        System.out.println();
        moto.ligarMotor();
        moto.abastecer();
        System.out.println("o consumo foi de : " + moto.calcularConsumo());

        System.out.println();
        caminhao.ligarMotor();
        caminhao.abastecer();
        System.out.println("o consumo foi de : " + caminhao.calcularConsumo());


    }
}
