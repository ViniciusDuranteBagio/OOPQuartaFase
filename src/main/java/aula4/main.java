package aula4;

public class main {
    static void main(String[] args) {
        System.out.println("=== EXERCÍCIOS DE HERANÇA ===\n");

        // Exercício 1: Herança básica
        System.out.println("EXERCÍCIO 1 - Herança básica:");
        Aluno aluno = new Aluno();
        aluno.setNome("João Silva");
        aluno.setIdade(20);
        aluno.setMatricula("2023001");
        System.out.println("=== Informações do Aluno ===");
        aluno.exibirInformacoes();
        System.out.println();

        // Exercício 2: Usando super() no construtor
        System.out.println("EXERCÍCIO 2 - Usando super() no construtor:");
        Aluno aluno2 = new Aluno("Maria Santos", 22, "2023002");
        System.out.println("=== Informações do Aluno ===");
        aluno2.exibirInformacoes();
        System.out.println();

        // Exercício 3: Hierarquia de Veículos
        System.out.println("EXERCÍCIO 3 - Hierarquia de Veículos:");
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CG 150", 150);

        System.out.println("=== Detalhes do Carro ===");
        carro.exibirDetalhes();
        System.out.println();

        System.out.println("=== Detalhes da Moto ===");
        moto.exibirDetalhes();
        System.out.println();

        // Exercício 4: Adicionando métodos em herança
        System.out.println("EXERCÍCIO 4 - Adicionando métodos em herança:");
        Cachorro cachorro = new Cachorro("Rex", 3);
        cachorro.dormir();
        cachorro.latir();
        System.out.println();

        // Exercício 5: Atributos protected
        System.out.println("EXERCÍCIO 5 - Atributos protected:");
        Cachorro cachorro2 = new Cachorro("Buddy", 2);
        cachorro2.exibirInformacoes();
        cachorro2.brincar();
        System.out.println();

        // Exercício 6: Método compartilhado
        System.out.println("EXERCÍCIO 6 - Método compartilhado:");
        Gerente gerente = new Gerente("Carlos Silva", 5000.0, "TI");
        System.out.println("=== Informações do Gerente ===");
        gerente.exibirInformacoes();
        gerente.aumentarSalario(10.0);
        System.out.println("=== Após aumento ===");
        gerente.exibirInformacoes();
        System.out.println();

        // Exercício 7: Usando super em métodos
        System.out.println("EXERCÍCIO 7 - Usando super em métodos:");
        Eletronicos eletronico = new Eletronicos("Smartphone", 1500.0, 12);
        System.out.println("=== Detalhes do Eletrônico ===");
        eletronico.exibirDetalhes();
        System.out.println();

        // Exercício 8: Hierarquia de Contas Bancárias
        System.out.println("EXERCÍCIO 8 - Hierarquia de Contas Bancárias:");
        ContaCorrente contaCorrente = new ContaCorrente("João", 5000.0, 15.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 3000.0, 0.5);

        System.out.println("=== Conta Corrente ===");
        contaCorrente.exibirDetalhes();
        System.out.println();

        System.out.println("=== Conta Poupança ===");
        contaPoupanca.exibirDetalhes();
        System.out.println();

        // Exercício 9: Classe base para jogos
        System.out.println("EXERCÍCIO 9 - Classe base para jogos:");
        Guerreiro guerreiro = new Guerreiro("Aragorn", 15, 85);
        Mago mago = new Mago("Gandalf", 20, 100);

        System.out.println("=== Guerreiro ===");
        guerreiro.exibirInformacoes();
        System.out.println();

        System.out.println("=== Mago ===");
        mago.exibirInformacoes();
        System.out.println();

        // Exercício 10: Construtores em cadeia
        System.out.println("EXERCÍCIO 10 - Construtores em cadeia:");
        Loja loja = new Loja("Mega Store", "São Paulo", "Eletrônicos");
        System.out.println("=== Dados da Loja ===");
        loja.exibirDados();
        System.out.println();

        System.out.println("=== FIM DOS EXERCÍCIOS ===");
    }
    }



