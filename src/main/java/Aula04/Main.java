package Aula04;

public class Main {
    public static void main(String[] args) {

        //atividade01
        System.out.println("Atividade 01\n");
        Aluno aluno1 = new Aluno("Renan", 20, 248117);
        aluno1.imprimirInfoAluno();
        System.out.println("=====================================\n\n" + "Atividade 02/03\n");

        //atividade02/03
        Carro carro = new Carro("VW", "Gol", 4);
        carro.imprimirInfoCarro();
        System.out.println("--------------------");

        Moto moto = new Moto("Honda", "CG", 125);
        moto.imprimirInfoMoto();
        System.out.println("=====================================\n\n" + "Atividade 04/05\n");

        //atividade04/05
        Cachorro cachorro = new Cachorro("Bob", 4);
        cachorro.exibirInfoAnimal();
        cachorro.latir();
        cachorro.dormir();
        cachorro.brincar();
        System.out.println("=====================================\n\n" + "Atividade 06\n");

        //atividade06
        Gerente gerente = new Gerente("Robert", 4700, "Vendas");
        gerente.imprimirInfoGerente();
        gerente.aumentarSalario(15);
        gerente.imprimirInfoGerente();
        System.out.println("=====================================\n\n" + "Atividade 07\n");

        //atividade07
        Eletronico eletronico = new Eletronico("Brastemp", 2550, 12);
        eletronico.exibirDetalhes();
        System.out.println("=====================================\n\n" + "Atividade 08\n");

        //atividade08
        ContaCorrente contaCorrente = new ContaCorrente("Renan", 1000, 0.12);
        contaCorrente.exibirInformacoes();
        System.out.println("----------------------");

        ContaPoupanca contaPoupanca = new ContaPoupanca("Renan", 10000, 0.3);
        contaPoupanca.exibirInformacoes();
        System.out.println("=====================================\n\n" + "Atividade 09\n");

        //atividade09
        Mago mago = new Mago("Zunks", 679, 23);
        mago.imprimirInfoPersonagem();
        System.out.println("----------------------");

        Guerreiro guerreiro = new Guerreiro("Dolbert", 4578, 2354);
        guerreiro.imprimirInfoPersonagem();
        System.out.println("=====================================\n\n" + "Atividade 10\n");

        //atividade10
        Loja loja = new Loja("Lojas Silva", "Gold Coast", "Furniture");
        loja.imprimirInfoEmpresa();


    }
}
