package classe.Exercicio_Aula_2;

public class Main_Produto {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.adcionarEstoque(20);
        System.out.println(produto.getQuantidadeProduto());
    }
}
