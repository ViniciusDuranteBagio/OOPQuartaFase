package Aula4;

//carro herda de veiculo
public class Carro extends Veiculo{

    //atributo do carro
    private int qtdDePortas;

    //construtor do carro
    public Carro(String marca, String modelo, int qtdDePortas) {
        super(marca, modelo);
        this.qtdDePortas = qtdDePortas;
    }


    //metodo getter para puxar dados na main
    public int getQtdDePortas() {
        return qtdDePortas;
    }
}
