package Aula4;

//moto herdou da classe veiculo
public class Moto extends Veiculo{
    //atributo da classe moto
    public int cilindrada;

    //construtor do objeto moto
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    //metodo getter para puxar o dado na main
    public int getCilindrada() {
        return cilindrada;
    }
}
