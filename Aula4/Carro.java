package Aula4;

public class Carro extends Veiculo{
    private int qtdPortas;
    public Carro(){
        super();
    }
    public Carro(String marca, String modelo, int qtdPortas){
        super(marca, modelo);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }
    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("        DETALHES DO CARRO        ");
        super.exibirDetalhes();
        System.out.println("Quantidade de portas: " + this.qtdPortas);
    }
}
