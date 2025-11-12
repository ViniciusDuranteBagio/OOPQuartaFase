public class Main {
    public static void main(String[] args) {

        String produto1 = "Arroz";
        String produto2 = "Feijão";
        String produto3 = "Macarrão";
        String produto4 = "Açúcar";
        String produto5 = "Café";

        double valor1 = 6.50, valor2 = 8.00, valor3 = 4.20, valor4 = 5.80, valor5 = 12.00;
        int estoque1 = 7, estoque2 = 15, estoque3 = 30, estoque4 = 25, estoque5 = 10;

        String log = "";
        String usuario = "João da Silva";

        System.out.println("=== ESTOQUE INICIAL ===");
        System.out.println(produto1 + " - R$" + valor1 + " - Estoque: " + estoque1);
        System.out.println(produto2 + " - R$" + valor2 + " - Estoque: " + estoque2);
        System.out.println(produto3 + " - R$" + valor3 + " - Estoque: " + estoque3);
        System.out.println(produto4 + " - R$" + valor4 + " - Estoque: " + estoque4);
        System.out.println(produto5 + " - R$" + valor5 + " - Estoque: " + estoque5);
        System.out.println();

        int adicionar = 20;
        estoque1 += adicionar;
        log += usuario + " adicionou " + adicionar + " unidades de " + produto1 + ". Novo total: " + estoque1 + "\n";

        int remover = 3;
        estoque3 -= remover;
        log += usuario + " removeu " + remover + " unidades de " + produto3 + ". Novo total: " + estoque3 + "\n";

        double valorAntigo = valor5;
        valor5 = 12.50;
        log += usuario + " alterou o valor de " + produto5 + " de R$" + valorAntigo + " para R$" + valor5 + "\n";

        adicionar = 1;
        estoque2 += adicionar;
        log += usuario + " adicionou " + adicionar + " unidades de " + produto2 + ". Novo total: " + estoque2 + "\n";

        remover = 2;
        estoque4 -= remover;
        log += usuario + " removeu " + remover + " unidades de " + produto4 + ". Novo total: " + estoque4 + "\n";

        System.out.println("=== ESTOQUE FINAL ===");
        System.out.println(produto1 + " - R$" + valor1 + " - Estoque: " + estoque1);
        System.out.println(produto2 + " - R$" + valor2 + " - Estoque: " + estoque2);
        System.out.println(produto3 + " - R$" + valor3 + " - Estoque: " + estoque3);
        System.out.println(produto4 + " - R$" + valor4 + " - Estoque: " + estoque4);
        System.out.println(produto5 + " - R$" + valor5 + " - Estoque: " + estoque5);
        System.out.println();

        System.out.println("=== LOG DE OPERAÇÕES ===");
        System.out.println(log);

        System.out.println("Programa encerrado Dudu.");
    }
}