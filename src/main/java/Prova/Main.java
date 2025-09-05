package Prova;

public class Main {
    public static void main(String[] args) {


    //Questão 1
    System.out.println("\nQuestão 1");
        Carro carro = new Carro();
            carro.marca = "toyota";
              carro.ano = 2022;

        carro.ExibirDados();

    //Questão 2
    System.out.println("\nQuestão 2");
        Pessoa pessoa = new Pessoa();
            pessoa.idade=31;
            pessoa.nome="Guilherme";
        pessoa.apresentar();

    //Questão 3
    System.out.println("\nQuestão 3");
        Produto produto = new Produto();
            produto.preco = 5.50;
            produto.nome = "Bala fini 50g";
        produto.informacoesProduto();

    //Questão 4
    System.out.println("Questão 4");
        ContaBancaria banco = new ContaBancaria();
            banco.saldo = 0;
            banco.titular = "Marco Otávio";
        banco.conta();

    ;
    //Questão 5
    System.out.println("Questão 5");
        Animal2 animal = new Animal2();
            animal.idade = 5;
            animal.nome = "Zuleini"; //É o nome do gato do meu amigo
        animal.fazersom();

    //Questão 6
    System.out.println("\nQuestão 6");
        Aluno aluno = new Aluno("Douglas", 21, "74865321");
            aluno.apresentar();
            System.out.println();

    //Questão 7
    System.out.println("\nQuestão 7");
        Cachorro cachorro = new Cachorro("Jhon", 8);
            cachorro.fazerSom();
        Gato gato = new Gato("Tom", 3);
            gato.fazerSom();
        System.out.println();

    //Questão 8
    System.out.println("\nQuestão 8");
        Professor professor = new Professor("Djoni", 38, "Matemática");
            professor.apresentar();
        System.out.println();

    //Questão 9
    System.out.println("\nQuestão 9");
        Funcionario func = new Funcionario("Pedro", 2000.00);
            func.calcBonus();
        Gerente gerente = new Gerente("João", 6000.00);
            gerente.calcBonus();
        System.out.println();

    }
}
