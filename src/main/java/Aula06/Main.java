package Aula06;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        //exercicio 1
//        System.out.println("========ATIVIDADE 1========\n");
//        Calculadora calculadora = new Calculadora();
//        calculadora.dividir(10, 2);
//        calculadora.dividir(10, 0);
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 2
//        System.out.println("========ATIVIDADE 2========\n");
//        Conversor conversor = new Conversor();
//        Integer numero = null;
//        while (numero == null) {
//            String entrada = JOptionPane.showInputDialog("Digite um valor: ");
//
//            numero = conversor.converter(entrada);
//            if (numero == null) {
//                JOptionPane.showMessageDialog(null, "Erro, digite um valor valido: ");
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Numero valido: " + numero);
//        System.out.println("-----------------------------------------------------------------------\n");
//
//
//        //exercicio 3
//        System.out.println("========ATIVIDADE 3========\n");
//        Pessoa pessoa = new Pessoa();
//        while (true) {
//            String entrada = JOptionPane.showInputDialog(null, "Digite a idade:");
//            if (entrada == null) {
//                JOptionPane.showMessageDialog(null, "Operação cancelada.");
//                break;
//            }
//            try {
//                int idade = Integer.parseInt(entrada);
//                pessoa.setIdade(idade);
//                JOptionPane.showMessageDialog(null, "Idade cadastrada com sucesso: " + pessoa.getIdade());
//                System.out.println("Idade cadastrada com sucesso: " + pessoa.getIdade());
//                break;
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Erro, digite um valor inteiro.");
//            } catch (IdadeInvalidaException e) {
//                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
//            }
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 4
//        System.out.println("========ATIVIDADE 4========\n");
//        Conta conta = new Conta();
//        conta.setSaldo(500);
//        try {
//            conta.sacar(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser sacado: ")));
//            System.out.println("Saque realizado. Saldo restante: " + conta.getSaldo());
//        } catch (SaldoInsuficienteException e) {
//            System.out.println("Erro: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Entrada inválida: " + e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 5
//        System.out.println("========ATIVIDADE 5========\n");
//        VetorNumeros vetor = new VetorNumeros();
//
//        try {
//            int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite um indice: "));
//            int valor = vetor.get(indice);
//            System.out.println("Valor na posição " + indice + ": " + valor);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//
//        //exercicio 6
//        System.out.println("========ATIVIDADE 6========\n");
//        CalculadoraMatematica calculadoraMatematica = new CalculadoraMatematica();
//
//        String entrada = JOptionPane.showInputDialog("Digite o número para calcular: ");
//        if (entrada == null) {
//            JOptionPane.showMessageDialog(null, "Operação cancelada.");
//            return;
//        }
//
//        try {
//            double numero = Double.parseDouble(entrada);
//            double raiz = calculadoraMatematica.raiz(numero);
//            JOptionPane.showMessageDialog(null, "Raiz: " + raiz);
//            System.out.println("Raiz:" + raiz);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Valor invalido");
//        } catch (IllegalArgumentException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//            System.out.println(e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 7
//        System.out.println("========ATIVIDADE 7========\n");
//        Usuario usuario = new Usuario();
//
//       String entrada = JOptionPane.showInputDialog("Digite seu nome: ");
//        if (entrada == null) {
//            JOptionPane.showMessageDialog(null, "Operacao cancelada!");
//            return;
//        }
//        try {
//            usuario.setNome(entrada);
//            JOptionPane.showMessageDialog(null, "Nome: " + usuario.getNome());
//            System.out.println("Nome: " + usuario.getNome());
//        } catch (NomeInvalidoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 8
//        System.out.println("========ATIVIDADE 8========\n");
//        Operacoes operacoes = new Operacoes();
//
//        String stringNumerador = JOptionPane.showInputDialog("Numerador:");
//        if (stringNumerador == null) return;
//        String stringDenominador = JOptionPane.showInputDialog("Divisor:");
//        if (stringDenominador == null) return;
//
//        try {
//            int a = operacoes.toInt(stringNumerador);
//            int b = operacoes.toInt(stringDenominador);
//            int resultado = operacoes.dividir(a, b);
//            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
//            System.out.println("Resultado: " + resultado);
//        } catch (NumberFormatException e) {
//            JOptionPane.showMessageDialog(null, "Valor invalido: digite inteiros.");
//        } catch (ArithmeticException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");
//
//        //exercicio 9
//        System.out.println("========ATIVIDADE 9========\n");
//        ValidadorDocumento validador = new ValidadorDocumento();
//
//        String entrada = JOptionPane.showInputDialog("Digite o CPF: ");
//        if (entrada == null) return;
//
//        try {
//            validador.validarCpf(entrada);
//            JOptionPane.showMessageDialog(null, "CPF valido");
//            System.out.println("CPF valido");
//        } catch (DocumentoInvalidoException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//        System.out.println("-----------------------------------------------------------------------\n");

        //exercicio 10
        System.out.println("========ATIVIDADE 10========\n");
        Login login = new Login();

        String usuario = JOptionPane.showInputDialog(null, "Usuario:");
        if (usuario == null) return;
        String senha = JOptionPane.showInputDialog(null, "Senha:");
        if (senha == null) return;

        try {
            login.autenticar(usuario.trim(), senha);
            JOptionPane.showMessageDialog(null, "Login OK!");
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println("-----------------------------------------------------------------------\n");
    }
}
