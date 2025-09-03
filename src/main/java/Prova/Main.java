package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "Gol";
        carro.ano = 2010;
        carro.mostrarDados();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Breno";
        pessoa.idade = 23;
        pessoa.apresentar();

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        produto1.nome = "Shampoo";
        produto1.preco = 30;
        produto2.nome = "Sabonete";
        produto2.preco = 3;
        produto1.mostrarProduto();
        produto2.mostrarProduto();

        ContaBancaria cb = new ContaBancaria();
        cb.titular = "Breno";
        cb.depositar(500);
        cb.depositar(500);
        cb.sacar(200);
        cb.sacar(900);
        cb.mostrarInformacoes();

        Animal animal = new Animal();
        animal.nome = "Jaguatirica";
        animal.idade = 8;
        animal.fazerSom();

        Pessoa2 pessoa2 = new Pessoa2();
        Aluno aluno = new Aluno();
        pessoa2.nome = "Joao";
        pessoa2.idade = 18;
        pessoa2.apresentar();
        aluno.nome = "Maria";
        aluno.idade = 19;
        aluno.matricula = 856;
        aluno.apresentar();

        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.fazerSom();
        gato.fazerSom();

        Professor professor = new Professor();
        professor.nome = "Stephen Curry";
        professor.idade = 37;
        professor.disciplina = "Basquete";
        professor.apresentar();

        Funcionario f1 = new Funcionario();
        Gerente g1 = new Gerente();
        f1.nome = "Lebron";
        f1.salario = 2000;
        f1.calcularBonus();
        f1.mostrarInformacoes();
        g1.nome = "Maria";
        g1.salario = 3000;
        g1.calcularBonusGerente();
        g1.mostrarInformacoes();

    }
}