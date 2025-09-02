package AulaHeranca;

public class Carro extends Veiculo {
    int qtdDePortas;

    public Carro (String marca, String modelo, int qtdDePortas) {
        super(marca, modelo);
        this.qtdDePortas = qtdDePortas;
    }
}
