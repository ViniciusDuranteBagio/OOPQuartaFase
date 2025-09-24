package Polimorfismo;

public class Cartao implements Pagamento{
   private String numeroCartao;
   public Cartao(String numeroCartao){
       this.numeroCartao = numeroCartao;
   }
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento no valor de: " + valor  + " no cartão: " + numeroCartao);

    }
}
