package heranca;

public class veiculo {

    protected int qtdRodas;

    public int getQtdRodas(){
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void andar(){
        System.out.println("andando");
    }
}
