
public class Aula_6 {
    public static void main(String[] args) {
        //Atividade1
        Calculadora calc = new Calculadora();
        try {
            double resultado = calc.divisão(10, 0);
            System.out.println("Resultado da Divisão " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }   //Atividade 2
        Conversor conversor = new Conversor();
        System.out.println(" Conversão válida ");
        conversor.converterParaInteiro("123");
        System.out.println("\n Conversão inválida ");
        conversor.converterParaInteiro("abc");

        //Atividade 3
        Pessoa pessoa = new Pessoa();
        try {
            System.out.println(" Idade válida");
            pessoa.setIdade(30);
            System.out.println("\n Idade inválida");
            pessoa.setIdade(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
        //Atividade 4
        Conta conta = new Conta(500.00);
        try {
            System.out.println("Saque válido");
            conta.saque(100.00);
            System.out.println("\nSaque inválido");
            conta.saque(450.00);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }
        //Atividade 5
        Vetor vetor = new Vetor();
        try {
            int indice = 6;
            int valor = vetor.getValor(indice);
            System.out.println("Valor no índice " + indice + ": " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice inválido! O intervalo válido é de 0 a 4.");
        } catch (Exception e) {
            System.out.println("Erro inesperado!");
        }

        //Atividade6
        try {
            CalcMatematica calculo = new CalcMatematica();
            double numero = -9;
            double resultado = calculo.calcularRaiz(numero);
            System.out.println("A raiz quadrada é: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        //Atividade7
        try {
            Usuario usuario = new Usuario();

            String nome = "";
            usuario.setNome(nome);

            System.out.println("Nome cadastrado com sucesso: " + usuario.getNome());

        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado!");
        }
        //Atividade8
        Operações op = new Operações();
        try {
            String texto1 = "10";
            String texto2 = "0";
            double resultado = op.dividir(texto1, texto2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("valor informado não é um número válido!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado!");
        }
        //Atividade9
        ValidarDoc validador = new ValidarDoc();
        try {
            String cpf = "12345678";
            validador.validarCPF(cpf);
        } catch (DocumentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        //Atividade10
        Login sistema = new Login();
        try {
            sistema.autenticar("ANa", "120105");
            sistema.autenticar("maria", "senhaerrada");
            sistema.autenticar("ADM", "123");
        } catch (UsuarioNaoEncontradoException e) {
            System.out.println(e.getMessage());
        } catch (SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }
        //Atividade11
        ContaBancaria conta11 = new ContaBancaria("João", 500.0);
        conta11.mostrarSaldo();
        try {
            conta11.depositar(200);
            conta11.sacar11(100);
            conta11.depositar(-50);
        } catch (ContaBancaria.DepositoInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (ContaBancaria.SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        try {
            conta11.sacar11(1000);
        } catch (ContaBancaria.SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        conta11.mostrarSaldo();

        //Atividade12
        int numero = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite um número inteiro positivo: ");
            String entrada = ValidarEntrada.lerLinha();
            try {
                numero = Integer.parseInt(entrada);
                if (numero >= 0) {
                    entradaValida = true;
                } else {
                    System.out.println("O número deve ser positivo. Tente novamente.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite apenas números inteiros.\n");
            }
        }

        //Atividade13
        try {
            executarProcesso();
        } catch (ErroComException erro) {
            System.out.println("Ocorreu um erro!");
            System.out.println("Código: " + erro.getCodigoErro());
            System.out.println("Mensagem: " + erro.getMessage());
        }
    }
      public static void executarProcesso() throws ErroComException {
        boolean falha = true;

        if (falha) {
            throw new ErroComException(1001, "Processo falhou ao conectar ao servidor.");
        }
        System.out.println(" Processo executado com sucesso.");
      }
}
