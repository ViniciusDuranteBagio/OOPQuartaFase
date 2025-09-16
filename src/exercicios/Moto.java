package exercicios;

class Moto extends Veiculo {
    int cilindrada;

    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    public void exibirDetalhes() {
        System.out.println("Moto: " + marca + " " + modelo + ", Cilindrada: " + cilindrada + "cc");
    }
}
