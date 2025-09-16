import exercicios.Caminhao;

public class VeiculosSistema {
    public static void main(String[] args) {
        Carro2 carro2 = new Carro2();
        carro2.placa = "ABC1234";
        carro2.modelo = "Sedan";
        
        Moto2 moto2 = new Moto2();
        moto2.placa = "XYZ5678";
        moto2.modelo = "Esportiva";
        
        Caminhao caminhao = new Caminhao();
        caminhao.placa = "DEF9012";
        caminhao.modelo = "Carga";
        
        carro2.ligarMotor();
        System.out.println("Carro - Consumo: " + carro.calcularConsumo() + " km/l");
        
        moto2.ligarMotor();
        System.out.println("Moto - Consumo: " + moto.calcularConsumo() + " km/l");
        
        caminhao.ligarMotor();
        System.out.println("Caminhão - Consumo: " + caminhao.calcularConsumo() + " km/l");
    }
}

