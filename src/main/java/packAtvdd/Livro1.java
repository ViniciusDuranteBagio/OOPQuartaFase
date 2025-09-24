package packAtvdd;

public class Livro1 {
    private String titulo, autor;
    private double preco;
    private int qtdEstoque;

    public Livro1(){
        this.titulo = "Sem titulo";
        this.autor = "Desconhecido";
        this.preco = 0.0;
        this.qtdEstoque = 0;
    }

    public Livro1(String titulo, String autor, double preco, int qtdEstoque){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPreco(){
        return preco;
    }
    public int getQtdEstoque(){
        return qtdEstoque;
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("O preco do livro deve ser maior que zero!");
        }
    }
    public void setQtdEstoque(int qtdEstoque){
        if(qtdEstoque > 0){
            this.qtdEstoque = qtdEstoque;
        } else {
            System.out.println("A quantidade de estoque não deve ser menor que zero!");
        }
    }

    public void vender(int quantidade){
        if (quantidade>0 && quantidade <= qtdEstoque) {
            this.qtdEstoque-=quantidade;
            System.out.println("Venda realizada com sucesso! Quantidade vendida: " + quantidade);
        }else {
            System.out.println("ERRO: Estoque insuficiente ou quantidade inválida.");
        }
    }

    public void reporEstoque(int quantidade){
        if (quantidade>0 && quantidade <= qtdEstoque) {
            this.qtdEstoque+=quantidade;
    }else {
            System.out.println("ERRO: Estoque insuficiente ou quantidade inválida.");
        }
    }
    public void exibirInfo(){
        System.out.println("Produto: " + titulo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + qtdEstoque);
        System.out.println("------------------------------------");
    }
}
