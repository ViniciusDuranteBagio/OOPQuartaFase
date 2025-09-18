package Aula5.Atividade;

public abstract class Produto implements IProduto {
    protected String nome;
    protected double preco;

    public Produto(String nome,double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void exibirResumo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Frete: R$ " + calcularFrete());
        System.out.println("---------------------------");
    }

}
