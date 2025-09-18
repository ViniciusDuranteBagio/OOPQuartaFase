package Aula4.Exercicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Questão 1 e 2");
         Aluno aluno = new Aluno("João", 20, "A123");
                aluno.exibirInformacoes();

        System.out.println("\nQuestão 3");
            Carro carro = new Carro("Toyota", "Corolla", 4);
            Moto moto = new Moto("Honda", "CB500", 500);
                carro.exibirDetalhes();
                moto.exibirDetalhes();

        System.out.println("\nQuestão 4 e 5");
            Cachorro cachorro = new Cachorro("Rex", 3);
                cachorro.dormir();
                cachorro.latir();
                cachorro.exibirInformacoes();
                cachorro.brincar();

        System.out.println("\nQuestão 6");
            Gerente gerente = new Gerente("Maria", 5000, "Vendas");
                gerente.aumentarSalario(10);
                gerente.exibirInformacoes();

        System.out.println("\nQuestão 7");
            Eletronico celular = new Eletronico("Smartphone", 2500, 12);
                celular.exibirDetalhes();

        System.out.println("\nQuestão 8");
            ContaCorrente cc = new ContaCorrente("Lucas", 1500, 25);
            ContaPoupanca cp = new ContaPoupanca("Ana", 2000, 0.5);
                cc.exibirDetalhes();
                cp.exibirDetalhes();

        System.out.println("\nQuestão 9");
            Guerreiro guerreiro = new Guerreiro("Arthur", 16, 90);
            Mago mago = new Mago("Merlin", 15, 350);
                guerreiro.exibirInformacoes();
                mago.exibirInformacoes();

        System.out.println("\nQuestão 10");
            Loja loja = new Loja("TechStore", "São Paulo", "Eletrônicos");
                loja.exibirDados();
    }
}