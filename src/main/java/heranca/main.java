package heranca;

public class main {
    public static void main(String[] args) {

        carro carro = new carro();
        moto moto = new moto();
        carro.setQtdRodas(4);
        moto.setQtdRodas(2);

        System.out.println(carro.getQtdRodas());
        System.out.println(moto.getQtdRodas());
        carro.andar();
        moto.andar();
    }
}
