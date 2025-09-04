package Prova;

public class Main {
    public static void main(String[] args) {
        // Questão 1
        Carro carro = new Carro("Chevrolet", 2025);
        carro.ExibirDados();

        // Questão 2
        Pessoa pessoa = new Pessoa("Gabrielly", 20);
        pessoa.apresentar();

        // Questão 3
        Produto produto1 = new Produto("Caderno", 15.50);
        Produto produto2 = new Produto("Caneta", 1.99);

        produto1.ExibirInformacoes();
        produto2.ExibirInformacoes();

        // Questão 4
        ContaBancaria conta = new ContaBancaria("Gabrielly");
        conta.depositar(1000);
        conta.sacar(400);
        conta.sacar(900); // para retornar erro

        // Questão 5
        Animal animal = new Animal("Bob", 2);
        animal.fazerSom();

        // Questão 6
        Aluno aluno = new Aluno("Gabrielly", 20, 1234);
        aluno.apresentar();

        // Questão 7
        Cachorro cachorro = new Cachorro("Bob", 2);
        Gato gato = new Gato("Eros",1);
        cachorro.fazerSom();
        gato.fazerSom();

        // Questão 8
        Professor professor = new Professor("João", 30, "Biologia");
        professor.apresentar();

        // Questão 9
        Funcionario funcionario = new Funcionario("Maria", 3000);
        System.out.println(funcionario.calcularBonus());

        Gerente gerente = new Gerente("Carla", 5000);
        System.out.println(gerente.calcularBonus());
    }
}
