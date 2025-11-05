
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Exercício 1 ===");
        try {
            Calculadora calc = new Calculadora();
            System.out.println(calc.dividir(10, 2));
            System.out.println(calc.dividir(10, 0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 3 ===");
        try {
            Pessoa p = new Pessoa();
            p.setIdade(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 4 ===");
        try {
            Conta c = new Conta(100);
            c.sacar(200);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 5 ===");
        VetorNumeros v = new VetorNumeros();
        try {
            System.out.println(v.acessarPosicao(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 6 ===");
        try {
            CalculadoraMatematica cm = new CalculadoraMatematica();
            System.out.println(cm.raizQuadrada(-9));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 7 ===");
        try {
            Usuario u = new Usuario();
            u.setNome("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 8 ===");
        Operacoes op = new Operacoes();
        op.converterEDividir("10", "0");
        op.converterEDividir("a", "5");

        System.out.println("\n=== Exercício 9 ===");
        try {
            ValidadorDocumento vd = new ValidadorDocumento();
            vd.validarCPF("12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 10 ===");
        Login login = new Login();
        try {
            login.autenticar("marcos", "errada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 11 ===");
        try {
            ContaBancaria conta = new ContaBancaria(200);
            conta.depositar(-10);
            conta.sacar(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Exercício 12 ===");
        ValidadorEntrada ve = new ValidadorEntrada();
        int numero = ve.lerNumeroPositivo();
        System.out.println("Número digitado: " + numero);

        System.out.println("\n=== Exercício 13 ===");
        try {
            throw new ErroComCodigoException("Erro de sistema", 500);
        } catch (ErroComCodigoException e) {
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Código: " + e.getCodigo());
        }
    }
}



