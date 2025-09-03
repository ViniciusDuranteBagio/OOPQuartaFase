package Prova;

public class Main {

    public static void main(String[] args) {

        // Questão 1
        Carro carro1 = new Carro();
        carro1.marca = "mercedes";
        carro1.ano = 2015;
        carro1.exibirDados();


        // Questão 2
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ingridy";
        pessoa1.idade = 22;
        pessoa1.apresentar();

        // Questão 3
        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 4500.0;

        Produto produto2 = new Produto();
        produto2.nome = "Mouse";
        produto2.preco = 150.0;
        produto1.exibirProduto();
        produto2.exibirProduto();


        // Questão 4
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Ingridy";
        conta1.depositar(1000);
        conta1.sacar(500);
        conta1.exibirSaldo();

        // Questão 5
        Animal animal1 = new Animal();
        animal1.nome = "Leao";
        animal1.idade = 3;
        animal1.fazerSom();


        // Questão 6
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ingridy";
        aluno1.idade = 22;
        aluno1.matricula = "20147589347";
        aluno1.apresentar();


        // Questão 7
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Milli";
        cachorro1.idade = 6;
        cachorro1.fazerSom();

        Gato gato1 = new Gato();
        gato1.nome = "Luna";
        gato1.idade = 2;
        gato1.fazerSom();


        // Questão 8
        Professor prof1 = new Professor();
        prof1.nome = "Vinicius";
        prof1.idade = 24;
        prof1.disciplina = "POO";
        prof1.apresentar();


        // QuestAo 9
        Funcionario func1 = new Funcionario();
        func1.nome = "Joao";
        func1.salario = 2000;
        System.out.println("Bônus do funcionário: " + func1.calcularBonus());

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Mariana";
        gerente1.salario = 5000;
        System.out.println("Bônus do gerente: " + gerente1.calcularBonus());
    }


}
