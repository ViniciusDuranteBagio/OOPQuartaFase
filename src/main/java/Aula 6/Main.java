package Aula 6;

public class Main {
    //1
    Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        try {
            System.out.print("Digite o dividendo: ");
            double a = sc.nextDouble();

            System.out.print("Digite o divisor: ");
            double b = sc.nextDouble();

            double resultado = calc.dividir(a, b);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();


        //2
        Conversor conversor = new Conversor();
        int numero = conversor.lerNumeroInteiro();
        System.out.println("Número digitado com sucesso: " + numero);

        //3
         Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            Pessoa pessoa = new Pessoa(idade);
            System.out.println("Idade cadastrada com sucesso: " + pessoa.getIdade());

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //4
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta(500.0); // saldo inicial

        try {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = sc.nextDouble();

            conta.sacar(valorSaque);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //5
        Scanner sc = new Scanner(System.in);
        VetorNumeros vetor = new VetorNumeros();

        try {
            System.out.print("Digite o índice que deseja acessar (0 a 4): ");
            int indice = sc.nextInt();

            int valor = vetor.acessar(indice);
            System.out.println("Valor na posição " + indice + ": " + valor);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //6
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica();

        try {
            System.out.print("Digite um número para calcular a raiz quadrada: ");
            double numero = sc.nextDouble();

            double resultado = calc.raizQuadrada(numero);
            System.out.println("Raiz quadrada: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //7
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o nome do usuário: ");
            String nome = sc.nextLine();

            Usuario usuario = new Usuario(nome);
            System.out.println("Usuário cadastrado com sucesso: " + usuario.getNome());

        } catch (NomeInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //8
        Scanner sc = new Scanner(System.in);
        Operacoes op = new Operacoes();

        try {
            System.out.print("Digite o dividendo: ");
            String textoA = sc.nextLine();
            int a = op.converterParaInteiro(textoA);

            System.out.print("Digite o divisor: ");
            String textoB = sc.nextLine();
            int b = op.converterParaInteiro(textoB);

            double resultado = op.dividir(a, b);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão: Digite apenas números inteiros!");
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //9
        Scanner sc = new Scanner(System.in);
        ValidadorDocumento validador = new ValidadorDocumento();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();

        try {
            validador.validarCPF(cpf);
        } catch (DocumentoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //10
        Scanner sc = new Scanner(System.in);
        LeitorArquivo leitor = new LeitorArquivo();

        System.out.print("Digite o caminho do arquivo a ser lido: ");
        String caminho = sc.nextLine();

        leitor.lerArquivo(caminho);

        sc.close();

        //11
        Scanner sc = new Scanner(System.in);
        Login login = new Login();

        try {
            System.out.print("Usuário: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            login.autenticar(usuario, senha);

        } catch (UsuarioNaoEncontradoException e) {
            System.out.println("❌ Erro: " + e.getMessage());
        } catch (SenhaIncorretaException e) {
            System.out.println("⚠️ Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //12
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(500.0); // saldo inicial

        try {
            System.out.println("Saldo atual: R$" + conta.getSaldo());

            System.out.print("Valor para depósito: ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);

            System.out.print("Valor para saque: ");
            double saque = sc.nextDouble();
            conta.sacar(saque);

            System.out.println("✅ Operações concluídas com sucesso!");
            System.out.println("Saldo final: R$" + conta.getSaldo());

        } catch (ValorNegativoException e) {
            System.out.println("❌ Erro: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("⚠️ Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();

        //13
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número positivo: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new ErroComCodigoException("Número negativo não permitido!", 400);
            }

            System.out.println("Número válido: " + numero);

        } catch (ErroComCodigoException e) {
            System.out.println("❌ ERRO [" + e.getCodigoErro() + "]: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();
}
