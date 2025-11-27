import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Agenda agenda = new Agenda();
    
    // Cores ANSI para terminal
    public static final String RESET = "\u001B[0m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BRANCO = "\u001B[37m";
    public static final String NEGRITO = "\u001B[1m";

    public static void main(String[] args) {
        int opcao = 0;
        
        do {
            System.out.println(NEGRITO + CYAN + "\n=== AGENDA VETERINARIA, PET SHOP 'VAI CORINTHIANS' ===" + RESET);
            System.out.println(VERDE + "1. Listar consultas" + RESET);
            System.out.println(VERDE + "2. Cadastrar nova consulta" + RESET);
            System.out.println(VERMELHO + "3. Sair" + RESET);
            System.out.print(AMARELO + "Escolha uma opcao: " + RESET);
            
            try {
                opcao = Integer.parseInt(scanner.nextLine().trim());
                
                switch (opcao) {
                    case 1:
                        listarConsultas();
                        break;
                    case 2:
                        cadastrarConsulta();
                        break;
                    case 3:
                        System.out.println(VERMELHO + "Saindo do sistema, finalmente um pouco de liberdade pra mim" + RESET);
                        break;
                    default:
                        System.out.println(MAGENTA + "Opcao invalida, não sabe ler? Tente novamente." + RESET);
                }
            } catch (NumberFormatException e) {
                System.out.println(MAGENTA + "Opcao invalida! Digite um numero dos que tem no menu né o cabeça oca." + RESET);
                opcao = 0;
            } catch (ValidacaoException e) {
                System.out.println(VERMELHO + "Erro na cara: " + e.getMessage() + RESET);
                opcao = 0;
            } catch (Exception e) {
                System.out.println(VERMELHO + "Erro inesperado KKKKKK: " + e.getMessage() + RESET);
                opcao = 0;
            }
        } while (opcao != 3);
        
        scanner.close();
    }

    private static void listarConsultas() {
        System.out.println(NEGRITO + CYAN + "\n=== CONSULTAS CADASTRADAS, PET SHOP 'VAI CORINTHIANS' ===" + RESET);
        agenda.listarConsultas();
        System.out.println(NEGRITO + "\nPressione Enter para voltar, ou nao pressiona, nao mando em ti mesmo" + RESET);
        scanner.nextLine();
    }

    private static void cadastrarConsulta() throws ValidacaoException {
        if (agenda.estaCheia()) {
            System.out.println(MAGENTA + "Agenda cheia KKKKKKKKK, garoteou demais ein" + RESET);
            return;
        }

        Animal animal = criarAnimal();
        String tipoAtendimento = escolherTipoAtendimento();
        String doenca = null;

        if (tipoAtendimento.equals("Consulta")) {
            doenca = escolherDoenca(animal);
        }

        Consulta consulta;
        if (doenca != null) {
            consulta = new Consulta(animal, tipoAtendimento, doenca);
        } else {
            consulta = new Consulta(animal, tipoAtendimento);
        }

        agenda.adicionarConsulta(consulta);
        System.out.println(AZUL + NEGRITO + "Consulta cadastrada com sucesso! Infelizmente vou ter que trabalhar mais... #ParaBobaQueOdioPassadah" + RESET);
        System.out.println(); 
        System.out.println(); 
    }

    private static Animal criarAnimal() throws ValidacaoException {
        System.out.println(NEGRITO + CYAN + "\n=== CADASTRO DE ANIMAL, PET SHOP 'VAI CORINTHIANS' ===" + RESET);
        
        // tudo é meio q validado antes, pq nao adianta deixar preencher tudo e dps validar, q isso só é perda de tempo p quem ta digitando
        System.out.print(VERDE + "Tipo de animal (Cachorro/Gato/Coelho): " + RESET);
        String tipoAnimal = scanner.nextLine().trim();
        
        if (!tipoAnimal.equalsIgnoreCase("cachorro") && 
            !tipoAnimal.equalsIgnoreCase("gato") && 
            !tipoAnimal.equalsIgnoreCase("coelho")) {
            throw new ValidacaoException(MAGENTA + "Tipo de animal invalido, não leu as opções não? Eu é que nao vou atender isso ai" + RESET);
        }
        
        System.out.print(VERDE + "Nome do animal: " + RESET);
        String nome = scanner.nextLine().trim();
        validarNomeAnimal(nome);
        
        System.out.print(VERDE + "Idade do animal: " + RESET);
        int idade;
        try {
            idade = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            throw new ValidacaoException(MAGENTA + "Idade deve ser um numero inteiro, naturalmente nao vai ser um polinômio ou algo do tipo" + RESET);
        }
        validarIdadeAnimal(idade);
        
        System.out.print(VERDE + "Raca do animal (o pet, nao tu rsrsrs): " + RESET);
        String raca = scanner.nextLine().trim();
        validarRacaAnimal(raca);

        // Cria o animal (validações já foram feitas acima)
        switch (tipoAnimal.toLowerCase()) {
            case "cachorro":
                return new Cachorro(nome, idade, raca);
            case "gato":
                return new Gato(nome, idade, raca);
            case "coelho":
                return new Coelho(nome, idade, raca);
            default:
                // nunca chega aqui, mas deixei pra frufru, pq usei qdo nao tinha a validação em tudo antes :)
                throw new ValidacaoException(MAGENTA + "Tipo de animal invalido, não leu as opções não? Eu é que nao vou atender isso ai" + RESET);
        }
    }

    private static String escolherTipoAtendimento() {
        System.out.println(NEGRITO + CYAN + "\n=== TIPO DE ATENDIMENTO, PET SHOP 'VAI CORINTHIANS' ===" + RESET);
        System.out.println(VERDE + "1. Banho (tao precisando ein, e é os dois)" + RESET);
        System.out.println(VERDE + "2. Tosa" + RESET);
        System.out.println(VERDE + "3. Banho e Tosa (eu ganho mais comissao nesse, me ajuda ai)" + RESET);
        System.out.println(VERDE + "4. Consulta" + RESET);
        System.out.print(AMARELO + "Escolha o tipo de atendimento: " + RESET);
        
        String opcao = scanner.nextLine().trim();
        
        switch (opcao) {
            case "1":
                return "Banho";
            case "2":
                return "Tosa";
            case "3":
                return "Banho e Tosa";
            case "4":
                return "Consulta";
            default:
                System.out.println(MAGENTA + "Opcao invalida animal! Escolhendo 'Banho' que é o que trabalho menos e ganho mais." + RESET);
                return "Banho";
        }
    }

    private static void validarNomeAnimal(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new ValidacaoException(MAGENTA + "Nome nao pode ser vazio, teu bixo nao tem nome nao?" + RESET);
        }
        for (char c : nome.toCharArray()) {
            if (!Character.isLetter(c) && c != ' ') {
                throw new ValidacaoException(MAGENTA + "Nome deve conter apenas letras e espacos, ta achando q é o elon musk pra por letras estranhas?" + RESET);
            }
        }
        if (nome.trim().length() < 2) {
            throw new ValidacaoException(MAGENTA + "Nome deve ter no minimo 2 caracteres, ou vai dizer q essa coisa ai se chama 'x'?" + RESET);
        }
    }

    private static void validarIdadeAnimal(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException(MAGENTA + "Idade deve ser um numero inteiro positivo maior que zero, ta tentando tirar com a minha cara colocando 0 ou menos ne?" + RESET);
        }
    }

    private static void validarRacaAnimal(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException(MAGENTA + "Raca deve ser informada, mesmo ele parecendo uma mistura meio estranha de vaca com cavalo." + RESET);
        }
    }

    private static String escolherDoenca(Animal animal) {
        String[] doencas = animal.getDoencas();
        boolean escolhaValida = false;
        String doencaEscolhida = null;
        
        while (!escolhaValida) { //se chegou ate na doença, nao vou mais deixar ficar voltando pro menu
                                 //pq do menu ate aq é mt tempo, tenho pena, dai vai ficar num loop até o cabeçudo acertar
            System.out.println(NEGRITO + CYAN + "\n=== DOENCAS DISPONIVEIS (NÃO VOU ASSOCIAR DOENÇA COM O CORINTHIANS) ===" + RESET);
            
            for (int i = 0; i < doencas.length; i++) {
                System.out.println((i + 1) + ". " + doencas[i]);
            }
            
            System.out.print(AMARELO + "Escolha o numero da doenca (se tiver mais de uma, paciencia que eu só faço uma coisa por vez): " + RESET);
            String entrada = scanner.nextLine().trim();
            
            try {
                int indice = Integer.parseInt(entrada) - 1;
                if (indice >= 0 && indice < doencas.length) {
                    doencaEscolhida = doencas[indice];
                    escolhaValida = true;
                } else {
                    System.out.println(MAGENTA + "Numero invalido! Escolha um numero da lista, nao é difícil." + RESET);
                }
            } catch (NumberFormatException e) {
                System.out.println(MAGENTA + "Digite um numero valido, nao é NEM UM POUCO difícil." + RESET);
            }
        }
        
        return doencaEscolhida;
    }
}

