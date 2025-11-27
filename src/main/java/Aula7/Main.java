package Aula7;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Testando funcionalidades no MAIN ===");

        Calculadora calc = new Calculadora();
        System.out.println("Somar 3 + 4 = " + calc.somar(3, 4));

        Pessoa p = new Pessoa("Ana", 20);
        System.out.println("Ana é maior de idade? " + p.ehMaiorDeIdade());

        Retangulo r = new Retangulo(4, 5);
        System.out.println("Área do Retângulo: " + r.calcularArea());

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        System.out.println("Saldo após depósito: " + conta.getSaldo());

        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        System.out.println("Valor do contador: " + c.getValor());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");
        System.out.println("Itens no carrinho: " + carrinho.getItens());
    }
}
