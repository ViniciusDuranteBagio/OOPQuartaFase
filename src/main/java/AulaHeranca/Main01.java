package AulaHeranca;

public class Main01 {
    public static void main(String[] args) {
        //ativ 1 e 2
        Aluno aluno1 = new Aluno("Bárbara", 21, "20250109");

        // aluno1.nome = "Bárbara";
        // aluno1.idade = 24;
       // aluno1.matricula = "20250902";

        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("Matrícula: " + aluno1.matricula);

        //ativ 3
        Carro carro1 = new Carro("Ford", "Ka", 4);
        Moto moto1 = new Moto("Honda", "CB 500", 500);

        System.out.println("Carro \n Marca: " + carro1.marca + "\n" + "Modelo: " + carro1.modelo + "QTD Portas: " + carro1.qtdDePortas);
        System.out.println("Moto \n Marca: " + moto1.marca + "\n" + "Modelo: " + moto1.modelo + "Cilindrada: " + moto1.cilindrada + "cc");

        // ativ 4 e 5
        Cachorro filhote = new Cachorro("Meg", 12);

        filhote.exibirInformacoes();
        filhote.dormir();
        filhote.latir();
        filhote.brincar();

        // ativ 6
        Gerente gerente1 = new Gerente("Carolzinha", 2500.00, "Marketing");
        System.out.println("Salário atual: ");
        gerente1.exibirInformacoes();

        gerente1.aumentarSalario(40);

        System.out.println("Salário após aumento: ");
        gerente1.exibirInformacoes();

         // ativ 7
        Eletronico soft = new Eletronico("PC", 5000.0, 12);
        soft.exibirDetalhes();



        // ativ 8
        ContaCorrente cc = new ContaCorrente("Cladinha", 452254.00, 45);
        ContaPoupanca cp = new ContaPoupanca("Josefina", 74525.00, 52);

        System.out.println("Conta corrente");
        cc.exibirDetalhes();

        System.out.println("Conta poupança");
        cp.exibirDetalhes();

        // ativ 9
        Guerreiro war = new Guerreiro("Jud", 15, 1200);
        Mago mag = new Mago("Lev", 225, 24568);

        System.out.println("Informações do guerreiro");
        war.exibirInformacoes();

        System.out.println("Informações do mago");
        mag.exibirInformacoes();


        // ativ 10
        Loja lj1 = new Loja("Central Modas", "Kansas", "Vestuário");
        System.out.println("Sobre a loja: ");
        lj1.exibirDados();

    }

}
