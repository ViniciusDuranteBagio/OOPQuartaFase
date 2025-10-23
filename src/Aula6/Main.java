package Aula6;

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.print("Digite o dividendo: ");
            double a = sc.nextDouble();

            System.out.print("Digite o divisor: ");
            double b = sc.nextDouble();

            double resultado = calc.dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.util.Scanner;

public class MainConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor conv = new Conversor();
        int numero = 0;

        while (true) {
            try {
                System.out.print("Digite um número inteiro: ");
                String texto = sc.nextLine();
                numero = conv.converterParaInteiro(texto);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        System.out.println("Número convertido com sucesso: " + numero);
    }
}





public class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
public class MainConta {
    public static void main(String[] args) {
        Conta conta = new Conta(1000);

        try {
            conta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}



import java.util.Scanner;

public class MainVetor {
    public static void main(String[] args) {
        VetorNumeros v = new VetorNumeros();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o índice (0 a 4): ");
            int i = sc.nextInt();
            System.out.println("Valor: " + v.acessarIndice(i));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice inválido! Digite entre 0 e 4.");
        }
    }
}

public class MainErroCodigo {
    public static void main(String[] args) {
        try {
            throw new ErroComCodigoException("Falha grave no sistema!", 500);
        } catch (ErroComCodigoException e) {
            System.out.println("Erro: " + e.getMessage() + " | Código: " + e.getCodigo());
        }
    }
}


 */