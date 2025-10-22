package Aula6;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Escolha qual atividade deseja executar
        // Exemplo: atividade1();
        atividade1();
    }

    // ATIVIDADE 1
    public static void atividade1() {
        Calculadora calc = new Calculadora();

        try {
            String input1 = JOptionPane.showInputDialog("Digite o numerador:");
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog("Digite o denominador:");
            double num2 = Double.parseDouble(input2);

            double resultado = calc.dividir(num1, num2);

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }

    // ATIVIDADE 2
    public static void atividade2() {
        Conversor conversor = new Conversor();
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");

            try {
                numero = conversor.conversor(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Operação cancelada");
                return;
            }

            JOptionPane.showMessageDialog(null, "Você digitou o número: " + numero);
        }
    }

    // ATIVIDADE 3
    public static void atividade3() {
        Pessoa pessoa = new Pessoa();

        try {
            String entrada = JOptionPane.showInputDialog("Digite a idade:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            int idade = Integer.parseInt(entrada);
            pessoa.setIdade(idade);

            JOptionPane.showMessageDialog(null, "Idade cadastrada com sucesso: " + pessoa.getIdade() + " anos");

        } catch (IdadeInvalidaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
        }
    }

    // ATIVIDADE 4
    public static void atividade4() {
        Conta conta = new Conta(500.00);

        try {
            String entrada = JOptionPane.showInputDialog("Saldo atual: R$ " + conta.getSaldo() +
                    "\nDigite o valor que deseja sacar:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }

            double valorSaque = Double.parseDouble(entrada);
            conta.sacar(valorSaque);

            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nNovo saldo: R$ " + conta.getSaldo());

        } catch (SaldoInsuficienteException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        }
    }

    // ATIVIDADE 5
    public static void atividade5() {
        VetorNumeros vetor = new VetorNumeros();

        try {
            String entrada = JOptionPane.showInputDialog(
                    "Digite um índice (0 a " + (vetor.getTamanho() - 1) + "):"
            );

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            int indice = Integer.parseInt(entrada);
            int valor = vetor.getValor(indice);

            JOptionPane.showMessageDialog(null, "Valor no índice " + indice + ": " + valor);

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Índice inválido. O intervalo válido é de 0 a 4");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
        }
    }

    // ATIVIDADE 6
    public static void atividade6() {
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            String entrada = JOptionPane.showInputDialog("Digite um número para calcular a raiz quadrada:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            double numero = Double.parseDouble(entrada);
            double resultado = calc.calcularRaizQuadrada(numero);

            JOptionPane.showMessageDialog(null, "A raiz quadrada de " + numero + " é: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 7
    public static void atividade7() {
        Usuario usuario = new Usuario();

        try {
            String entrada = JOptionPane.showInputDialog("Digite o nome do usuário:");
            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            usuario.setNome(entrada);

            JOptionPane.showMessageDialog(null, "Nome cadastrado com sucesso: " + usuario.getNome());

        } catch (NomeInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 8
    public static void atividade8() {
        Operacoes op = new Operacoes();

        try {
            String texto1 = JOptionPane.showInputDialog("Digite o primeiro número:");
            if (texto1 == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }
            double num1 = op.converterParaNumero(texto1);

            String texto2 = JOptionPane.showInputDialog("Digite o segundo número:");
            if (texto2 == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }
            double num2 = op.converterParaNumero(texto2);

            double resultado = op.dividir(num1, num2);

            JOptionPane.showMessageDialog(null, "Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 9
    public static void atividade9() {
        ValidadorDocumento validador = new ValidadorDocumento();

        try {
            String entrada = JOptionPane.showInputDialog("Digite o CPF:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            if (!validador.validar(entrada)) {
                throw new DocumentoInvalidoException("CPF inválido");
            }

            JOptionPane.showMessageDialog(null, "CPF válido");

        } catch (DocumentoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 10
    public static void atividade10() {
        Login sistemaLogin = new Login();

        try {
            String login = JOptionPane.showInputDialog("Digite o nome de usuário:");
            if (login == null) {
                JOptionPane.showMessageDialog(null, "Login cancelado pelo usuário.");
                return;
            }

            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if (senha == null) {
                JOptionPane.showMessageDialog(null, "Login cancelado pelo usuário.");
                return;
            }

            sistemaLogin.autenticar(login, senha);

            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");

        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 11
    public static void atividade11() {
        ContaBancaria contaOrigem = new ContaBancaria(1000.0);
        ContaBancaria contaDestino = new ContaBancaria(500.0);

        try {
            String entrada = JOptionPane.showInputDialog(
                    "Saldo origem: R$ " + contaOrigem.getSaldo() +
                            "\nSaldo destino: R$ " + contaDestino.getSaldo() +
                            "\nDigite o valor para transferir:"
            );

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                return;
            }

            double valor = Double.parseDouble(entrada);

            contaOrigem.transferir(contaDestino, valor);

            JOptionPane.showMessageDialog(null,
                    "Transferência realizada com sucesso\n" +
                            "Saldo origem: R$ " + contaOrigem.getSaldo() + "\n" +
                            "Saldo destino: R$ " + contaDestino.getSaldo()
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números");
        } catch (IllegalArgumentException | ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // ATIVIDADE 12
    public static void atividade12() {
        ValidadorEntrada validador = new ValidadorEntrada();
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite um número positivo:");

                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Operação cancelada pelo usuário");
                    return;
                }

                numero = Double.parseDouble(entrada);

                if (!validador.validar(numero)) {
                    JOptionPane.showMessageDialog(null, "Digite apenas valores positivos");
                    continue;
                }

                valido = true;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números");
            }
        }

        JOptionPane.showMessageDialog(null, "Número digitado: " + numero);
    }

    // ATIVIDADE 13
    public static void atividade13() {
        try {
            throw new ErroComCodigoException("Ocorreu um erro no sistema", 404);
        } catch (ErroComCodigoException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro: " + e.getMessage() + "\nCódigo: " + e.getCodigo()
            );
        }
    }
}
