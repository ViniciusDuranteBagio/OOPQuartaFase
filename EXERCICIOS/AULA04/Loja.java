public class Loja extends Empresa {
    private String tipoDeProduto;

    public Loja(String nome, String cidade, String tipoDeProduto) {
        super(nome, cidade);
        this.tipoDeProduto = tipoDeProduto;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }
}
