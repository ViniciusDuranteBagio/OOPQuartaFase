package Aula4.Atividade;

public class Main {
    public static void main(String[] args) {

     Aluno alunoA = new Aluno();
     alunoA.setNome("Luana");
     alunoA.setIdade(26);
     alunoA.setMatricula("123456");
     alunoA.exibirInformacoes();

    Aluno alunoB = new Aluno("Mariana",19,"15662456");
    alunoB.exibirInformacoes();

     Carro carro = new Carro("Ferrari", "849 Testarossa", 2);
     Moto moto = new Moto("Honda", "CBF 500", 500);
     carro.exibirDetalhes();
     moto.exibirDetalhes();

     Cachorro cachorro = new Cachorro("LILI", 8);
     cachorro.dormir();
     cachorro.latir();

     Cachorro cachorro2 = new Cachorro("Bolinha", 5);
     cachorro2.exibirInformacoes();
     cachorro2.brincar();

     Gerente gerente1 = new Gerente("Lara Gregório", 10000.0, "SI");
     gerente1.exibirInformacoes();
     gerente1.aumentarSalario(50.0);
     gerente1.exibirInformacoes();


     Eletronico eletronico1 = new Eletronico("Geladeira", 2000.0, 12);
     eletronico1.exibirDetalhes();

     ContaCorrente contaCorrente1 = new ContaCorrente("Mariana", 3000.0, 8.0);
     ContaPoupanca contaPoupanca1 = new ContaPoupanca("Claudia", 1000.0, 4.8);
     contaCorrente1.exibirDetalhes();
     contaPoupanca1.exibirDetalhes();

     Guerreiro guerreiro1 = new Guerreiro("Rowan", 100, 300);
     Mago mago1 = new Mago("Aelin", 110, 1000);
     guerreiro1.exibirInformacoes();
     mago1.exibirInformacoes();

     Loja loja1 = new Loja("Vencedor", "Gravatal", "Variado");
     loja1.exibirDados();


    }
}
