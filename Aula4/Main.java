package Aula4;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXERCÍCIO 1 - Criando uma herança básica");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alina");
        aluno1.setIdade(21);
        aluno1.setMatricula("1234");
        aluno1.exibirInformacoes();

        System.out.println("\nEXERCÍCIO 2 - Utilizando o super() no Construtor");
        Aluno aluno2 = new Aluno("Diego", 23, "2345");
        aluno2.exibirInformacoes();

        System.out.println("\nEXERCÍCIO 3 - Criando uma Hierarquia de Veículos");
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("Fastback");
        carro1.setQtdPortas(4);
        carro1.exibirDetalhes();
        Carro carro2 = new Carro("Volkswagen", "Fusca", 2);
        carro2.exibirDetalhes();
        Moto moto1 = new Moto("Harley-Davidson", "FXDR 114 (Softail)", 1868);
        moto1.exibirDetalhes();

        System.out.println("\nEXERCÍCIO 4 - Adicionando Métodos em Herança");
        Cachorro cachorro1 = new Cachorro("Coragem", 5);
        cachorro1.dormir();
        cachorro1.latir();

        System.out.println("\n EXERCÍCIO 5 - Protegendo Atributos com protected");
        Cachorro cachorro2 = new Cachorro("Tirano", 2);
        cachorro2.exibirInformacoes();
        cachorro2.brincar();

        System.out.println("\nEXERCÍCIO 6 - Criando uma Classe com um Método Compartilhado");
        Gerente gerente1 = new Gerente("Aline", 10000, "Vendas");
        gerente1.aumentarSalario(5);
        gerente1.exibirInformacoes();

        System.out.println("\nEXERCÍCIO 7 - Chamando Métodos da Superclasse com super");
        Eletronico eletronico1 = new Eletronico("Geladeira", 4499.99, 18);
        eletronico1.exibirDetalhes();

        System.out.println("\nEXERCÍCIO 8 - Criando uma Hierarquia de Contas Bancárias");
        ContaCorrente contaC1 = new ContaCorrente("Geovana", 68473.95, 14.75);
        contaC1.exibirDetalhes();
        ContaPoupanca contaP1 = new ContaPoupanca("Mariana", 78351.22, 0.7);
        contaP1.exibirDetalhes();

        System.out.println("\nEXERCÍCIO 9 - Criando uma Classe Base para Jogos");
        Guerreiro guerreiro1 = new Guerreiro("Akra", 32, 600);
        guerreiro1.exibirInformacoes();
        Mago mago1 = new Mago("Elize", 20, 450);
        mago1.exibirInformacoes();

        System.out.println("\nEXERCÍCIO 10 - Trabalhando com Construtores em Cadeia");
        Loja loja1 = new Loja("Renner", "Tubarão", "Roupas");
        loja1.exibirDados();
    }
}
