package Prova;

public class Main {
    public static void main(String[] args) {
        // 1
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.ano = 2025;
        carro.ExibirDados();

        // 2
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Joao";
        pessoa.idade = 19;
        pessoa.apresentar();

        // 3
        Produto produto = new Produto();
        produto.nome = "Pizza";
        produto.preco = 12.5;
        System.out.println("\nProduto: " + produto.nome + "\nPreco: R$" + produto.preco);

        // 4
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Marcelo";
        contaBancaria.saldo = 500;
        contaBancaria.depositar(200);
        contaBancaria.sacar(400);
        contaBancaria.sacar(1000);

        // 5
        Animal animal = new Animal();
        animal.nome = "Urso";
        animal.idade = 7;
        animal.fazerSom();

        // 6
        Aluno aluno = new Aluno();
        aluno.nome = "Mário";
        aluno.idade = 17;
        aluno.matricula = 249025;
        aluno.apresentar();

        // 7
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Spike";
        cachorro.idade = 5;
        cachorro.fazerSom();


        Gato gato = new Gato();
        gato.nome = "Lua";
        gato.idade = 6;
        gato.fazerSom();

        // 8
        Professor professor = new Professor();
        professor.nome = "Júlio";
        professor.idade = 47;
        professor.disciplina = "Português";
        professor.apresentar();

        // 9
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Paulo";
        funcionario.salario = 2200;
        System.out.println("O Funcionário " + funcionario.nome + " possui um bônus de R$" + funcionario.calcularBonus());

        Gerente gerente = new Gerente();
        gerente.nome = "Evandro";
        gerente.salario = 6000;
        System.out.println("O Gerente " + gerente.nome + " possui um bônus de R$" + gerente.calcularBonus());
    }
}
