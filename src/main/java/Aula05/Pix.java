package Aula05;

public class Pix implements Pagamento {
    private String qrCode;

    public Pix(String qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado com PIX!");
        System.out.println("QR code: " + qrCode);
    }
}
