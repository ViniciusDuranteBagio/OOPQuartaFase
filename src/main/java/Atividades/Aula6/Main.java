package Atividades.Aula6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // questão 13

   //     try {
   //         throw new ErroComCodigoException("Erro: A operação não pode ser realizada.", 1001);
   //     } catch (ErroComCodigoException e) {
   //         String mensagem = "Mensagem: " + e.getMessage() + "\nCódigo de erro: " + e.getCodigoErro();
   //         JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
   //     }
   // }

        // questão 12

    //        ValidadorEntrada validador = new ValidadorEntrada();
    //        boolean entradaValida = false;
    //        int numero = 0;

    //        while (!entradaValida) {
    //            try {
    //                numero = validador.lerNumeroPositivo();
    //                entradaValida = true;
    //                JOptionPane.showMessageDialog(null, "Número positivo lido: " + numero);
    //            } catch (EntradaInvalidaException e) {
    //               JOptionPane.showMessageDialog(null, e.getMessage());
    //            }
    //        }

        // questão 11

        //ContaBancaria conta = new ContaBancaria();
        //boolean continuar = true;

        //while (continuar) {
        //    String operacao = JOptionPane.showInputDialog("Escolha uma operação: " +
        //            "\n1. Depositar " +
        //            "\n2. Sacar " +
        //            "\n3. Ver Saldo " +
        //            "\n4. Sair");

        //    if (operacao == null || operacao.equals("4")) {
        //        continuar = false;
        //        continue;
        //    }

        //    try {
        //        double valor;
        //        switch (operacao) {
        //            case "1":
        //                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a depositar:"));
        //                conta.depositar(valor);
        //                break;
        //            case "2":
        //                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a sacar:"));
        //                conta.sacar(valor);
        //                break;
        //            case "3":
        //                JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + conta.getSaldo());
        //                break;
        //            default:
        //                JOptionPane.showMessageDialog(null, "Operação inválida. Tente novamente.");
        //        }
        //    } catch (ValorInvalidoException e) {
        //        JOptionPane.showMessageDialog(null, e.getMessage());
        //    } catch (NumberFormatException e) {
        //        JOptionPane.showMessageDialog(null, "Erro: Valor inválido. Por favor, insira um número.");
        //    }
       // }

        // questão 10

    //    Login login = new Login();

    //    String usuario = JOptionPane.showInputDialog("Digite o nome de usuário:");

    //    if (usuario == null) {
    //        JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //        return;
    //    }

    //    String senha = JOptionPane.showInputDialog("Digite a senha:");

    //    if (senha == null) {
    //        JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //        return;
    //    }

    //    try {
    //        login.autenticar(usuario, senha);
    //    } catch (UsuarioNaoEncontradoException e) {
    //        JOptionPane.showMessageDialog(null, e.getMessage());
    //    } catch (SenhaIncorretaException e) {
   //         JOptionPane.showMessageDialog(null, e.getMessage());
    //    }

        // questão 9

    //    ValidadorDocumento validador = new ValidadorDocumento();
    //    String entrada = JOptionPane.showInputDialog("Digite o CPF (11 dígitos):");

    //    if (entrada == null) {
    //        JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //        return;
    //    }

    //    try {
    //        validador.validarCPF(entrada);
    //        JOptionPane.showMessageDialog(null, "CPF válido: " + entrada);
    //    } catch (DocumentoInvalidoException e) {
    //        JOptionPane.showMessageDialog(null, e.getMessage());
    //    }


        // questão 8

    //    Operacoes operacoes = new Operacoes();

    //    String entradaNumerador = JOptionPane.showInputDialog("Digite o numerador:");

    //    if (entradaNumerador == null) {
    //        JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //        return;
    //    }

    //    String entradaDenominador = JOptionPane.showInputDialog("Digite o denominador:");

    //    if (entradaDenominador == null) {
    //        JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //        return;
    //    }

    //    try {
    //        double numerador = operacoes.converterParaNumero(entradaNumerador);
    //        double denominador = operacoes.converterParaNumero(entradaDenominador);

    //        double resultado = operacoes.dividir(numerador, denominador);
    //        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

    //    } catch (NumberFormatException e) {
    //        JOptionPane.showMessageDialog(null, "Erro: Entrada inválida. Por favor, insira um número válido.");
    //    } catch (ArithmeticException e) {
    //        JOptionPane.showMessageDialog(null, e.getMessage());
    //    }


        // questão 7
    //    Usuario usuario = new Usuario();
    //    boolean nomeValido = false;

    //    while (!nomeValido) {
    //        String entrada = JOptionPane.showInputDialog("Digite o seu nome:");

    //        if (entrada == null) {
    //            JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //            return;
    //        }

    //        try {
    //            usuario.setNome(entrada);
    //            JOptionPane.showMessageDialog(null, "Nome cadastrado: " + usuario.getNome());
    //            nomeValido = true;
    //        } catch (NomeInvalidoException e) {
    //            JOptionPane.showMessageDialog(null, e.getMessage());
    //        }
    //    }

// questão 6

        //    CalculadoraMatematica calculadora = new CalculadoraMatematica();
    //    boolean continuar = true;

    //    while (continuar) {
    //        String entrada = JOptionPane.showInputDialog("Digite um número para calcular a raiz quadrada ou 'sair' para encerrar:");

    //        if (entrada == null || entrada.equalsIgnoreCase("sair")) {
    //            JOptionPane.showMessageDialog(null, "Operação encerrada.");
    //            continuar = false;
    //            continue;
    //        }

    //        try {
    //            double numero = Double.parseDouble(entrada);
    //            double raiz = calculadora.calcularRaizQuadrada(numero);
    //            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + raiz);
    //        } catch (IllegalArgumentException e) {
    //            JOptionPane.showMessageDialog(null, e.getMessage());
    //        }
    //    }

        // questão 5

    //    VetorNumeros vetor = new VetorNumeros();
    //    boolean continuar = true;

    //    for (int i = 0; i < 5; i++) {
    //        String entrada = JOptionPane.showInputDialog("Informe um valor para a posição " + i + ":");
    //        vetor.setValor(i, Integer.parseInt(entrada));
    //    }

    //    while (continuar) {
    //        String entradaIndice = JOptionPane.showInputDialog("Digite um índice para acessar (0 a 4) ou 'sair' para encerrar:");

    //        if (entradaIndice == null || entradaIndice.equalsIgnoreCase("sair")) {
    //            JOptionPane.showMessageDialog(null, "Operação encerrada.");
    //            continuar = false;
    //            continue;
    //        }

    //        try {
    //            int indice = Integer.parseInt(entradaIndice);
    //            int valor = vetor.getValor(indice);
    //            JOptionPane.showMessageDialog(null, "Valor na posição " + indice + ": " + valor);
    //        } catch (IndexOutOfBoundsException e) {
    //            JOptionPane.showMessageDialog(null, e.getMessage());
    //        } catch (NumberFormatException e) {
    //            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
    //       }
    //    }

        // questão 4

    //    Conta conta = new Conta(1000.00);
    //    boolean saqueValido = false;

    //    while (!saqueValido) {
    //        String entrada = JOptionPane.showInputDialog("Digite o valor do saque:");

    //        if (entrada == null) {
    //            JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //            return;
    //        }

    //        try {
    //            double valorSaque = Double.parseDouble(entrada);
    //            conta.sacar(valorSaque);
    //            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso. Saldo atual: " + conta.getSaldo());
    //            saqueValido = true;
    //        } catch (SaldoInsuficienteException e) {
    //            JOptionPane.showMessageDialog(null, e.getMessage());
    //        } catch (NumberFormatException e) {
    //            JOptionPane.showMessageDialog(null, "Por favor, insira um valor válido.");
    //        }
    //    }

        // questão 3

    //    Pessoa pessoa = new Pessoa();
    //    boolean idadeValida = false;

    //    while (!idadeValida) {
    //        String entrada = JOptionPane.showInputDialog("Digite a idade:");

    //        if (entrada == null) {
    //            JOptionPane.showMessageDialog(null, "Operação cancelada.");
    //            return;
    //        }

    //        try {
    //            int idade = Integer.parseInt(entrada);
    //            pessoa.setIdade(idade);
    //            JOptionPane.showMessageDialog(null, "Idade cadastrada: " + pessoa.getIdade());
    //            idadeValida = true;
    //        } catch (IdadeInvalidaException e) {
    //            JOptionPane.showMessageDialog(null, e.getMessage());
    //        } catch (NumberFormatException e) {
    //            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
    //        }
    //    }

        // questão 2
  //  Conversor conversor = new Conversor();
   // boolean entradaValida = false;

   //     while (!entradaValida) {
   //     String entrada = JOptionPane.showInputDialog("Digite um valor:");

   //     if (entrada == null) {

   //         JOptionPane.showMessageDialog(null, "Operação cancelada.");
   //         return;
   //     }

   //     try {
   //         int numero = conversor.converterParaInteiro(entrada);
    //        JOptionPane.showMessageDialog(null, "Número convertido: " + numero);
    //        entradaValida = true;
    //    } catch (IllegalArgumentException e) {
    //        JOptionPane.showMessageDialog(null, e.getMessage());
   //     }
   // }

        // questão 1

        //Calculadora calculadora = new Calculadora();

        //try {
       //     double resultado1 = calculadora.dividir(10, 2);
       //     System.out.println("Resultado 1: " + resultado1);

       //     double resultado2 = calculadora.dividir(10, 0);
       //     System.out.println("Resultado 2: " + resultado2);
       // } catch (ArithmeticException e) {
       //     System.out.println("Erro: " + e.getMessage());
       // }
    }
}
