package Aula7;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println("Somar 3 + 4 = " + calc.somar(3, 4));
        System.out.println("Subtrair 10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("Multiplicar 3 * 5 = " + calc.multiplicar(3, 5));
        System.out.println("Dividir 10 / 2 = " + calc.dividir(10, 2));

        Pessoa p1 = new Pessoa("Ana", 20);
        Pessoa p2 = new Pessoa("Leo", 15);
        System.out.println("Ana é maior de idade? " + p1.ehMaiorDeIdade());
        System.out.println("Leo é maior de idade? " + p2.ehMaiorDeIdade());

        Retangulo r = new Retangulo(4, 5);
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.depositar(-50);
        System.out.println("Saldo: " + conta.getSaldo());

        Contador c = new Contador();
        c.incrementar();
        c.incrementar();
        c.incrementar();
        System.out.println("Contador: " + c.getValor());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã");
        carrinho.adicionarItem("banana");
        System.out.println("Itens: " + carrinho.getItens());
    }
}