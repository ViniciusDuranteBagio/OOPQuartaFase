package Prova;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet", 2009);
        carro.setMarca("Chevrolet");
        carro.setAno(2009);
        carro.ExibirDados();

        Pessoa pessoa = new Pessoa("Ruan", 20);
        pessoa.setNome("Ruan");
        pessoa.setIdade(20);
        pessoa.apresentar();

        Produto produto = new Produto("Arroz", 15.99);
        produto.exibirDados();
        Produto produto2 = new Produto("Caderno", 20.99);
        produto2.exibirDados();

        ContaBancaria contaBancaria = new ContaBancaria("Zezé", 10000);
        contaBancaria.exibirSaldo();
        contaBancaria.depositar(1500);
        contaBancaria.exibirSaldo();
        contaBancaria.sacar(11500);
        contaBancaria.exibirSaldo();

        Animal animal = new Animal("Urso", 12);
        animal.fazerSom();

        Aluno aluno = new Aluno(2023);
        aluno.apresentar();

        Cachorro cachorro = new Cachorro("Caramelo", 2);
        cachorro.fazerSom();
        Gato gato = new Gato("Garfield", 22);
        gato.fazerSom();

        Professor professor = new Professor("Kauã Mattei", 21, "Borracha");
        professor.apresentar();

        Funcionario funcionario = new Funcionario("German Cano", 1500);
        funcionario.calcularBonus();
        Gerente gerente = new Gerente("Fabio", 2000);
        gerente.calcularBonus();
    }
}
