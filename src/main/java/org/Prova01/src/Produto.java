public class Produto {
    private String nome;
    private double preco;

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarDados(){
        System.out.println("Produto: " + getNome() +
                            "\nPreço: " + getPreco());
    }
}
