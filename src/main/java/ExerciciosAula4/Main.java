package ExerciciosAula4;

public class Main {
    public static void main(String[] args) {

        // --- Exercício 1: Criando uma herança básica ---
        System.out.println("--- Exercício 1: Herança Básica ---");
        // Para este exercício, o construtor de Aluno não é necessário, então criamos um Aluno sem argumentos.
        // Isso requer um construtor padrão implícito em Aluno e Pessoa, que o Java cria se nenhum outro for definido.
        // Como definimos construtores para o ex. 2, essa parte é conceitual. A implementação prática está no ex. 2.
        System.out.println("A lógica do exercício 1 foi incorporada e aprimorada no exercício 2.");

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 2: Utilizando o super() no Construtor ---
        System.out.println("--- Exercício 2: Construtor com super() ---");
        Aluno aluno = new Aluno("João Silva", 20, "2024-001");
        System.out.println("Nome do Aluno: " + aluno.nome);
        System.out.println("Idade do Aluno: " + aluno.idade);
        System.out.println("Matrícula do Aluno: " + aluno.matricula);

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 3: Criando uma Hierarquia de Veículos ---
        System.out.println("--- Exercício 3: Hierarquia de Veículos ---");
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.quantidadeDePortas = 4;
        System.out.println("Carro: " + meuCarro.marca + " " + meuCarro.modelo);
        System.out.println("Portas: " + meuCarro.quantidadeDePortas);

        System.out.println(); // Linha em branco para separar

        Moto minhaMoto = new Moto();
        minhaMoto.marca = "Honda";
        minhaMoto.modelo = "CB 500";
        minhaMoto.cilindrada = 500;
        System.out.println("Moto: " + minhaMoto.marca + " " + minhaMoto.modelo);
        System.out.println("Cilindradas: " + minhaMoto.cilindrada + "cc");

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 4: Adicionando Métodos em Herança ---
        System.out.println("--- Exercício 4: Métodos em Herança ---");
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";
        meuCachorro.idade = 5;
        meuCachorro.dormir(); // Método herdado de Animal
        meuCachorro.latir();  // Método da própria classe Cachorro

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 5: Protegendo Atributos com protected ---
        System.out.println("--- Exercício 5: Atributos protected ---");
        Cachorro dog = new Cachorro();
        dog.nome = "Bolinha"; // Atributo 'nome' é protected, mas acessível
        dog.idade = 3;
        dog.exibirInformacoes();
        dog.brincar();

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 6: Criando uma Classe com um Método Compartilhado ---
        System.out.println("--- Exercício 6: Método Compartilhado ---");
        Gerente gerente = new Gerente();
        gerente.nome = "Ana Costa";
        gerente.salario = 5000.00;
        gerente.departamento = "Vendas";
        System.out.println("Salário inicial do gerente " + gerente.nome + ": R$" + gerente.salario);
        gerente.aumentarSalario(10); // Aumento de 10%
        System.out.println("Salário após aumento: R$" + gerente.salario);
        System.out.println("Departamento: " + gerente.departamento);

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 7: Chamando Métodos da Superclasse com super ---
        System.out.println("--- Exercício 7: super.metodo() ---");
        Eletronico tv = new Eletronico();
        tv.nome = "Smart TV 4K";
        tv.preco = 2500.00;
        tv.garantiaEmMeses = 12;
        tv.exibirDetalhes();

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 8: Criando uma Hierarquia de Contas Bancárias ---
        System.out.println("--- Exercício 8: Hierarquia de Contas ---");
        ContaCorrente cc = new ContaCorrente();
        cc.titular = "Maria Oliveira";
        cc.saldo = 1500.00;
        cc.taxaManutencao = 25.00;
        System.out.println("Conta Corrente - Titular: " + cc.titular + ", Saldo: R$" + cc.saldo + ", Taxa: R$" + cc.taxaManutencao);

        ContaPoupanca cp = new ContaPoupanca();
        cp.titular = "José Santos";
        cp.saldo = 10000.00;
        cp.taxaJuros = 0.5; // 0.5%
        System.out.println("Conta Poupança - Titular: " + cp.titular + ", Saldo: R$" + cp.saldo + ", Juros: " + cp.taxaJuros + "%");

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 9: Criando uma Classe Base para Jogos ---
        System.out.println("--- Exercício 9: Hierarquia de Personagens ---");
        Guerreiro g = new Guerreiro();
        g.nome = "Thorin";
        g.nivel = 10;
        g.forca = 100;
        System.out.println("Guerreiro: " + g.nome + ", Nível: " + g.nivel + ", Força: " + g.forca);

        Mago m = new Mago();
        m.nome = "Elara";
        m.nivel = 12;
        m.mana = 150;
        System.out.println("Mago: " + m.nome + ", Nível: " + m.nivel + ", Mana: " + m.mana);

        System.out.println("\n" + "=".repeat(40) + "\n");

        // --- Exercício 10: Trabalhando com Construtores em Cadeia ---
        System.out.println("--- Exercício 10: Construtores em Cadeia ---");
        Loja minhaLoja = new Loja("Magazine Central", "São Paulo", "Eletrônicos");
        System.out.println("Nome da Loja: " + minhaLoja.nome);
        System.out.println("Cidade: " + minhaLoja.cidade);
        System.out.println("Tipo de Produto: " + minhaLoja.tipoDeProduto);
    }
}