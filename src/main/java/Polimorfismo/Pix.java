package Polimorfismo;

public class Pix implements Pagamento {
    private String chavePix;
    String nomeConta;
    public Pix(String chavePix,  String nomeConta) {
        this.chavePix = chavePix;
        this.nomeConta = nomeConta;

    }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pix no valor de: " + valor + "R$ para " + nomeConta );

    }
}
