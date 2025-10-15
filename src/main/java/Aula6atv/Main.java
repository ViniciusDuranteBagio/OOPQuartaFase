package Aula6atv;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1*/
        Calculadora calculo = new Calculadora();

        try {
            double resultado = calculo.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            double resultado2 = calculo.dividir(20, 5);
            System.out.println("Resultado: " + resultado2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        /*2*/

        Conversor conversor = new Conversor();

        try {
            String valor = JOptionPane.showInputDialog(null, "Digite um valor para fazer a conversão:");
            valor = String.valueOf(conversor.converter(valor));
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido! Digite apenas números inteiros.");
        } finally {
            System.out.println("Tentando converter o valor...\n");
        }


        /*3*/

        Pessoa pessoa = new Pessoa();

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade:"));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Erro: Informe uma idade válida");
        } finally {
            System.out.println("Tentando cadastrar a idade...\n");

        }

        /*4*/

        Conta conta = new Conta(400);

        try {
            double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de saque:"));

        } catch (HeadlessException e) {
            throw new RuntimeException("Valor de saldo insuficiente para fazer o saque");
        } finally {
            System.out.println("Saque realizado com sucesso");

        }

        /*5*/

        VetorNumeros vetor = new VetorNumeros();

        try {
            System.out.print("Informe o índice (0 a " + (vetor.getTamanho() - 1) + "): ");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inválido! O intervalo válido é de 0 a " + (vetor.getTamanho() - 1) + ".");
        } catch (Exception e) {
            System.out.println("Erro: valor digitado inválido! Digite apenas números inteiros.");
        } finally {
            System.out.println("Operação concluída.");
        }

        /*6*/

        Scanner scanner = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            System.out.print("Digite um número para calcular a raiz quadrada: ");
            double numero = scanner.nextDouble();

            double resultado = calc.calcularRaizQuadrada(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + resultado);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro: entrada inválida! Digite um número válido.");
        }
        finally {
            System.out.println("Operação finalizada.");
        }

        /*7*/

        scanner = new Scanner(System.in);
        Usuario usuario = new Usuario();
        boolean nomeValido = false;

        while (!nomeValido) {
            try {
                System.out.print("Digite o nome do usuário: ");
                String nomeDigitado = scanner.nextLine();

                usuario.setNome(nomeDigitado); // tenta cadastrar o nome
                nomeValido = true;

                System.out.println("Usuário cadastrado com sucesso! Nome: " + usuario.getNome());
            }
            catch (NomeInvalidoException e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Tentando cadastrar o nome...\n");
            }
        }

        scanner.close();

        /*8*/


        scanner = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        try {
            System.out.print("Digite o primeiro número: ");
            String texto1 = scanner.nextLine();
            int num1 = operacoes.converterParaNumero(texto1); // Pode gerar NumberFormatException

            System.out.print("Digite o segundo número: ");
            String texto2 = scanner.nextLine();
            int num2 = operacoes.converterParaNumero(texto2); // Pode gerar NumberFormatException

            double resultado = operacoes.dividir(num1, num2); // Pode gerar ArithmeticException
            System.out.println("Resultado da divisão: " + resultado);
        }
        catch (NumberFormatException e) {
            System.out.println("Erro: valor digitado não é um número válido!");
        }
        catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida!");
        }
        finally {
            System.out.println("Operação finalizada.");
        }

        scanner.close();

        /*9*/

        scanner = new Scanner(System.in);
        ValidadorDocumento validador = new ValidadorDocumento();

        try {
            System.out.print("Digite o CPF (somente números): ");
            String cpf = scanner.nextLine();

            validador.validarCPF(cpf); // Pode lançar DocumentoInvalidoException

            System.out.println("✅ CPF válido!");
        }
        catch (DocumentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        finally {
            System.out.println("Validação finalizada.");
        }

        scanner.close();

        /*10*/

        scanner = new Scanner(System.in);
        Login sistemaLogin = new Login();

        try {
            System.out.print("Usuário: ");
            String usuario1 = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            sistemaLogin.autenticar(usuario1, senha);

        } catch (UsuarioNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SenhaIncorretaException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Processo de login finalizado.");
        }

        scanner.close();

        /*11*/

        scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria(1000.0); // saldo inicial de R$1000

        try {
            System.out.print("Digite o valor para depósito: ");
            double deposito = scanner.nextDouble();
            conta1.depositar(deposito);

            System.out.print("Digite o valor para saque: ");
            double saque = scanner.nextDouble();
            conta.sacar(saque);

            System.out.println("Saldo final: R$" + conta.getSaldo());
        }
        catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }
        catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro inesperado! Verifique os valores informados.");
        }
        finally {
            System.out.println("Operação bancária finalizada.");
        }

        scanner.close();

        /*12*/

        ValidadorEntrada validar = new ValidadorEntrada();
        int numeroValido = validar.lerNumeroPositivo();
        System.out.println("Número válido digitado: " + numeroValido);

        /*13*/

        try {
            verificarOperacao(false);

        } catch (ErroComCodigoException e) {
            System.out.println("⚠️ Erro detectado!");
            System.out.println("Código do erro: " + e.getCodigoErro());
            System.out.println("Mensagem: " + e.getMessage());
        }
    }

    public static void verificarOperacao(boolean sucesso) throws ErroComCodigoException {
        if (!sucesso) {
            throw new ErroComCodigoException(404, "Operação não encontrada ou inválida!");
        }
        System.out.println("Operação concluída com sucesso!");
    }


    }







