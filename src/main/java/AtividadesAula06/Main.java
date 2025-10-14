package AtividadesAula06;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        System.out.println("Atividade 1");
        Calculadora calc = new Calculadora();

        double n1 = 12;
        double n2 = 0;

        try {
            double resultado = calc.dividir(n1, n2);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Atividade 2");
        Conversor conv = new Conversor();

        String[] entradas = {"abc", "42"};

        for (String entrada : entradas) {
            try {
                int numero = conv.converterParaInteiro(entrada);
                System.out.println("Numero: " + numero);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: " + entrada + " não é um número válido");
            }
        }

        System.out.println("Atividade 3");
        Pessoa pes = new Pessoa();
        int[] idades = {25, -12, 0};

        for (int i : idades) {
            try {
                pes.setIdade(i);
                System.out.println("Idade cadastrada. " + pes.getIdade());
                break;
            } catch (IdadeInvalidadaException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 4");
        Conta conta = new Conta(1000);
        double[] saques = {400, 200, 520};

        for (double valor : saques) {
            try {
                conta.sacar(valor);
                System.out.println("Saldo restante: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 5");
        VetorNumeros vetor = new VetorNumeros();
        int[] tentativas = {2, 5, -1, 4};

        for (int indice : tentativas) {
            try {
                int valor = vetor.acessar(indice);
                System.out.println("Valor na posição " + indice + ": " + valor);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 6");
        CalculadoraMatematica calculo = new CalculadoraMatematica();
        double[] numeros = {5, 8, 49, -7, 0};

        for (double n : numeros) {
            try {
                double resultado = calculo.calcularRaizQuadrada(n);
                System.out.println("Raiz quadrada de " + n + " é = " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 7");
        Usuario usuario = new Usuario();
        String[] nomes = {"Ana", "Luis", "Babs", null, " "};

        for (String nome : nomes) {
            try {
                usuario.setNome(nome);
                System.out.println("Nome cadastrado. " + usuario.getNome());
                break;
            } catch (NomeInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 8");

        String valor1 = "10";
        String valor2 = "0";

        try {
            int numero1 = Operacoes.converterTextoParaNumero(valor1);
            int numero2 = Operacoes.converterTextoParaNumero(valor2);

            double resultado = Operacoes.dividir(numero1, numero2);
            System.out.println("Resultado da divisão é " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro. Formato inválido");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 9");

        String[] cpfs = {"123.456.789", "5585", "", null};

        for (String cpf : cpfs) {
            try {
                ValidarDocumento.validarCPF(cpf);
            } catch (DocumentoInvalidoException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Atividade 10");
        Login login = new Login();

        try {
            login.autenticar("Barbara", "1234");
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }


        try {
            login.autenticar("joao", "4568");
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        try {
            login.autenticar("aa", "adafifm");
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Atividade 11");
        ContaBancaria conta1 = new ContaBancaria("Bárbara", 2500);
        ContaBancaria conta2 = new ContaBancaria("Joao", 450);

        try {
            conta1.depositar(-100);
        } catch (ValorInvalidoException e) {
            System.out.println(e.getMessage());
        }


        try {
            conta1.sacar(2000);
        } catch (ValorInvalidoException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação de saque finalizada.");
        }


        try {
            conta1.transferir(conta2, 200);
        } catch (ValorInvalidoException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operação de saque finalizada.");
        }

        System.out.println("Saldo final de Barbara: R$" + conta1.getSaldo());
        System.out.println("Saldo final de Joao: R$" + conta2.getSaldo());


        System.out.println("Atividade 12");
        double[] entradass = {21, -56, 0, 25, 12.2};
        double numeroValido = 0;

        for (double valor : entradass) {
            try {
                System.out.println("Tentando validar " + valor);
                numeroValido = ValidadorEntrada.validarNumeroPositivo(valor);
                System.out.println("Valor válido " + numeroValido);
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Numero final " + numeroValido);


        System.out.println("Atividade 13");
        int[] numeros1 = {50, -5, 150, 0, 25};

        for (int n : numeros1) {
            try {
                TesteErroCodigo.verificarNumero(n);
            } catch (ErroCodigoException e) {
                System.out.println("Erro: " + e.getMessage() + " | Código: " + e.getCodigo());
            }
        }
    }
}



