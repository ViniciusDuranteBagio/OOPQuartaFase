public class Carro extends Veiculo {
    int qtdPortas;
    public Carro(String marca, String modelo, int qtdPortas){
        super(marca, modelo);
        this.qtdPortas=qtdPortas;
    }
}
