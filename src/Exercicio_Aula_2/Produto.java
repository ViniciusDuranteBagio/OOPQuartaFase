package classe.src.Exercicio_Aula_2;

public class Produto {

 private String nome;
 private double preco;
 private int quantidadeProduto;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            System.out.println("O preco foi mudado para " + this.preco);
        }else {
            System.out.println("O Preco precisa ser maior que Zero");
        }
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        if(quantidadeProduto >= 0) {
            this.quantidadeProduto = quantidadeProduto;
        }else {
            System.out.println("A quantidade precisa ser igual ou maior que Zero");
        }


    }

    public void adcionarEstoque(int quantidade){
          this.quantidadeProduto+=quantidade;
    }

    public void Vender(int quantidade){
        if (quantidadeProduto > quantidade){
            quantidadeProduto -= quantidade;
        }else {
            System.out.println("Nao pode vender mais do que tem em estoque");
        }
    }
}
