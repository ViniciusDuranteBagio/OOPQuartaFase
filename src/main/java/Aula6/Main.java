package Aula6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade 1 - Calculadora");
        Calculadora calculadora = new Calculadora();
        double a = 10;
        double b = 0;
        try{
            double resultado = calculadora.dividir(a, b);
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
        Usuario usuario = new Usuario();
        String[] nomes = {"Lua", "Lara", "Quelly", ""};

        for (String nome : nomes) {
            try {
                usuario.setNome(nome);
                System.out.println("Nome cadastrado: " + usuario.getNome());
            } catch (NomeInvalidoException e) {
                System.out.println(e.getMessage());
            }
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

    }
}
