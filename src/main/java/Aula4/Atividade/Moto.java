package Aula4.Atividade;

public class Moto extends Veiculo{
    private int cilindradas;


    public Moto(String marca, String modelo,int cilindradas) {
        super(marca, modelo);
        this.cilindradas=cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + this.cilindradas + " cc");
    }
}
