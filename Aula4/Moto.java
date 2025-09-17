package Aula4;

public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(){
        super();
    }
    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("        DETALHES DA MOTO        ");
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas + " cc");
    }
}
