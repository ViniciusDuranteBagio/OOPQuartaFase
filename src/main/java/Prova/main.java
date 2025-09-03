package Prova;

public class main {
    public static void main(String[] args) {

        //Questão 9

        Funcionario funcionario = new Funcionario("Carlos", 3000);
        System.out.println(funcionario.nome + " - Bônus: " + funcionario.calcularBonus());

        Gerente gerente = new Gerente("Ana", 5000);
        System.out.println(gerente.nome + " - Bônus: " + gerente.calcularBonus());

        //Questão 8

        Professora professora = new Professora("Ana", 35, "Matemática");
        professora.apresentar();

        //Questão 7

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.fazerSom();

        Gato gato = new Gato("Miau");
        gato.fazerSom();

        //Questão 6

        Aluno aluno = new Aluno("Maria", 20, "123456");
        aluno.apresentar();

        //Questão 5
        Animal meuAnimal = new Animal();
        meuAnimal.idade = 5;
        meuAnimal.nome = "Rex";
        meuAnimal.som();

        //Questão 4

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Maria";
        conta.saldo = 1000;
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);
        System.out.println("Saldo final: R$" + conta.getSaldo());


        //Questão 3
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Laptop";
        produto1.preco = 2999.99;
        produto1.exibirDados();

        produto2.nome = "Smartphone";
        produto2.preco = 2999.99;
        produto2.exibirDados();

        // Questão 2
        Pessoa pessoa = new Pessoa();
        pessoa.idade = 30;
        pessoa.nome = "João";
        pessoa.apresentar();

        // Questão 1
        Carro veiculo = new Carro();
        veiculo.ano = 2015;
        veiculo.marca = "Ford";

        veiculo.exibirDados();

    }
}