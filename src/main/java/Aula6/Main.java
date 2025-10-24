package Aula6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade 1 - Calculadora");
        Calculadora calculadora = new Calculadora();

        try{
            double resultado = calculadora.dividir(1,2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 2 - Conversor");
        Conversor conv = new Conversor();
        String[] entradas = {"abc", "42"};

        for (String entrada : entradas) {
            try {
                int numero = conv.converter(entrada);
                System.out.println("Numero: " + numero);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + entrada + " não é um número válido");
            }
        }

        System.out.println("Atividade 3 - Pessoa");
        Pessoa pessoa = new Pessoa();
        int[] idades = {37, 0, -8};

        for (int i : idades) {
            try {
                pessoa.setIdade(i);
                System.out.println("Idade cadastrada. " + pessoa.getIdade());
                break;
            } catch (IdadeInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 4 - Conta");
        Conta conta = new Conta(300);
        double[] saques = {50, 27, 290};

        for (double valor : saques) {
            try {
                conta.sacar(valor);
                System.out.println("Saldo restante: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 5 - Vetor");
        VetorNumeros vetor = new VetorNumeros();
        int[] tentativas = {3, 7, 5, -2};

        for (int indice : tentativas) {
            try {
                int valor = vetor.acessar(indice);
                System.out.println("Valor na posição " + indice + ": " + valor);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 6 - Raiz quadrada");
        CalculadoraMatematica calculo = new CalculadoraMatematica();
        double[] numeros = {49, -32, 21, 100, 6724};

        for (double n : numeros) {
            try {
                double resultado = calculo.calcularRaiz(n);
                System.out.println("Raiz quadrada de " + n + " é = " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 7 - Nome");
            try {
                String nome = "";
                Usuario usuario = new Usuario(nome);
                System.out.println(usuario.nome);
            } catch (NomeInvalidoException e) {
                System.out.println(e.getMessage());
            }

        System.out.println("Atividade 8 - Operações");
        String v1 = "42";
        String v2 = "0";

        try {
            int n1 = Operacoes.converterTextoNum(v1);
            int n2 = Operacoes.converterTextoNum(v2);
            double resultado = Operacoes.dividir(n1, n2);
            System.out.println("Resultado da divisão é " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro. Formato inválido");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 9 - Documento");
        ValidadorDocumento vd1 = new ValidadorDocumento();
        try {
            vd1.validarCPF("12345abc890");
        } catch (DocumentoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 10 - Login");
        Login login1 = new Login();
        try {
            login1.autenticar("lua", "batata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 11 - Conta Bancária");
        ContaBancaria conta1 = new ContaBancaria(100);

        try {
            conta1.depositar(-50);
        } catch (ContaBancaria.ValorNegativoException e) {
            System.out.println(e.getMessage());
        }

        try {
            conta1.sacar(200);
        } catch (ContaBancaria.SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo: R$" + conta1.getSaldo());

        System.out.println("Atividade 12 - Entrada Usuário");
        Scanner sc = new Scanner(System.in);
        ValidadorEntrada v = new ValidadorEntrada();
        int n = v.lerPositivo(sc);
        System.out.println("Número válido: " + n);

        System.out.println("Atividade 13 - Erro com o Código");
        try {
            throw new ErroComCodigoException("Erro grave ocorrido", 404);
        } catch (ErroComCodigoException e) {
            System.out.println("Código: " + e.getCodigo() + " - " + e.getMessage());
        }
    }
}
