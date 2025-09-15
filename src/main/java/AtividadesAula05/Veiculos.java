package AtividadesAula05;

public abstract class Veiculos {

    String placa;
    String modelo;

    public Veiculos(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void ligarMotor() {
        System.out.println(modelo + " ligado");
    }
    public void abastecer() {
        System.out.println(modelo + " abastecido");
    }
    public abstract void calcularConsumo();


}

