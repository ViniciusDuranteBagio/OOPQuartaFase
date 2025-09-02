package exercicio10;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Renner", "Tubarão", "Roupas");
        System.out.println("A loja " + loja.nome + ", localizada na cidade " + loja.cidade +
                " vende " + loja.tipoDeProduto);
    }
}
