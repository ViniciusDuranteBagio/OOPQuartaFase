package Aula6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        ATVD 01)
//        Calculadora calc = new Calculadora();
//        try {
//            System.out.println("Resultado: " + calc.dividir(14, 2));
//            System.out.println("Resultado: " + calc.dividir(14, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 02)
//        Conversor conv = new Conversor();
//        while (true) {
//            String input = JOptionPane.showInputDialog("Digite um número:");
//            if (input == null) break; // cancel
//            try {
//                int num = conv.converter(input);
//                System.out.println("Número: " + num);
//                break;
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente.");
//            }
//
//        }

//        ATVD 03)
//        try {
//            Pessoa p = new Pessoa(19);
//            System.out.println("Idade: " + p.getIdade());
//            Pessoa p2 = new Pessoa(-4);
//        } catch (IdadeInvalidaException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 04)
//        Conta conta = new Conta(1000);
//        try {
//            conta.sacar(500);
//            System.out.println("Saque realizado. Saldo atual: " + conta.getSaldo());
//            conta.sacar(600);
//        } catch (SaldoInsuficienteException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 05)
//        VetorNumeros vetor = new VetorNumeros();
//        try {
//            vetor.setValor(0, 12);
//            vetor.setValor(4, 30);
//            System.out.println("Valor no índice 0: " + vetor.getValor(0));
//            System.out.println("Valor no índice 4: " + vetor.getValor(4));
//            System.out.println("Valor no índice 5: " + vetor.getValor(5));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 06)
//        Calculadora calc = new Calculadora();
//        try {
//            System.out.println("Raiz quadrada de 4: " + calc.raizQuadrada(4));
//            System.out.println("Raiz quadrada de -4: " + calc.raizQuadrada(-4));
//        } catch (IllegalArgumentException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 07)
//        try {
//            Usuario u1 = new Usuario("João");
//            System.out.println("Nome: " + u1.getNome());
//            Usuario u2 = new Usuario("");
//        } catch (NomeInvalidoException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//      ATVD 08)
//        Operacoes op = new Operacoes();
//        String texto = "10";
//        String divisor = "0";
//
//        try {
//            int numerador = op.converterParaInteiro(texto);
//            int denominador = op.converterParaInteiro(divisor);
//            double resultado = op.dividir(numerador, denominador);
//            System.out.println("Resultado: " + resultado);
//        } catch (NumberFormatException e) {
//            System.out.println("Erro de conversão: " + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Erro de divisão: " + e.getMessage());
//        }

//        ATVD 09)
//        ValidadorDocumento validador = new ValidadorDocumento();
//        try {
//            validador.validarCPF("12345678901");
//            System.out.println("CPF válido");
//            validador.validarCPF("123");
//        } catch (DocumentoInvalidoException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 10)
//        Login login = new Login();
//        try {
//            login.autenticar("usuario1", "senha1");
//            System.out.println("Login bem-sucedido");
//            login.autenticar("usuario3", "senha1");
//        } catch (UsuarioNaoEncontradoException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } catch (SenhaIncorretaException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//        ATVD 11)
//        ContaBancaria conta = new ContaBancaria(1000);
//        try {
//            conta.depositar(500);
//            System.out.println("Depósito realizado. Saldo atual: " + conta.getSaldo());
//            conta.sacar(2000);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } catch (SaldoInsuficienteException e) {
//            System.out.println("Erro: " + e.getMessage());
//        }

//      ATVD 12)
//        ValidadorEntrada validador = new ValidadorEntrada();
//        int numero = validador.lerNumeroPositivo();
//        if (numero >= 0) {
//            System.out.println("Número válido: " + numero);
//        }

//        ATVD 13)
//        try {
//            throw new ErroComCodigoException("Erro personalizado", 400);
//        } catch (ErroComCodigoException e) {
//            System.out.println("Erro: " + e.getMessage() + " Código: " + e.getCodigo());
//        }




    }
}

