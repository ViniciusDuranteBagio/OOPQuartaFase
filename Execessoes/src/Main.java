//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número (divisor): ");
        double num2 = sc.nextDouble();

        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida!");
            }
            double resultado = calc.dividir(num1, num2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }*/


        /*
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Digite um número inteiro: ");
            String entrada = sc.nextLine();

            try {
                numero = conversor.converterParaInteiro(entrada);
                valido = true; // Se deu certo, sai do loop
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Erro: valor inválido! Digite apenas números.");
            }
        }

        System.out.println("✅ Valor convertido com sucesso: " + numero);
        sc.close();

/*
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        try {
            pessoa.setIdade(idade);
            System.out.println("✅ Idade cadastrada com sucesso: " + pessoa.getIdade());
        } catch (Pessoa.IdadeInvalidaException e) {
            System.out.println("⚠️ Erro: " + e.getMessage());
        }

        sc.close();*/





/*
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta(100.0);

        System.out.print("Digite o valor do saque: ");
        double valor = sc.nextDouble();

        try {
            conta.sacar(valor);
        } catch (Conta.SaldoInsuficienteException e) {
            System.out.println("⚠️ Erro: " + e.getMessage());
        }

        sc.close();*/

       /* Scanner sc = new Scanner(System.in);
        VetorNumeros vetor = new VetorNumeros();

        try {
            System.out.print("Informe o índice: ");
            int indice = sc.nextInt();
            System.out.println("Valor: " + vetor.getValor(indice));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }*/

        /*Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            System.out.print("Digite um número: ");
            double n = sc.nextDouble();
            System.out.println("Raiz quadrada: " + calc.raizQuadrada(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } */




        /*try {
            Usuario u = new Usuario("");
        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }*/



       /* Login login = new Login();
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String user = sc.nextLine();
        System.out.print("Senha: ");
        String pass = sc.nextLine();

        try {
            login.autenticar(user, pass);
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }*/




        /*ContaBancaria conta = new ContaBancaria();

        try {
            conta.depositar(500);
            conta.sacar(700);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }*/






            try {
                throw new ErroComCodigoException("Falha grave no sistema", 500);
            } catch (ErroComCodigoException e) {
                System.out.println("Erro " + e.getCodigo() + ": " + e.getMessage());
            }
    }
}