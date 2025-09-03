public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: o preço deve ser maior que zero.");
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + this.nome + " | Preço: R$ " + this.preco);
    }
}