package Prova;

public class Main {
    public static void main(String[] args) {

        // ativ1
        Carro carro1 = new Carro();
        carro1.marca = "Hyundai";
        carro1.ano = 2011;
        carro1.exibirDados();
        System.out.println();

        // ativ2
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Flávio";
        pessoa1.idade = 52;
        pessoa1.apresentar();
        System.out.println();

        // ativ3

        Produto produto1 = new Produto();
        produto1.nome = "Celular";
        produto1.preco = 2555.25;
        produto1.exibirProduto();

        Produto produto2 = new Produto();
        produto2.nome = "Notebook";
        produto2.preco = 5245.25;
        produto2.exibirProduto();
        System.out.println();


        //ativ 4
        ContaBancaria cb = new ContaBancaria();
        cb.titular = "Aldo";
        cb.saldo = 1500;
        cb.depositar(520);
        cb.sacar(560);
        cb.sacar(6000);
        cb.exibirSaldo();
        System.out.println();


        //ativ 5
        Animal animal1 = new Animal("Rex", 9);
        // animal1.nome = "Rex";
        // animal1.idade = 9;
        animal1.exibirDados();
        animal1.fazerSom();
        System.out.println();

        // ativ 6
        AlunoHeranca aluno1 = new AlunoHeranca("Jorge", 15, "20250903");
        aluno1.apresentar();


        // ativ 7
        Cachorro dog = new Cachorro("Rob", 12);
        dog.exibirDados();
        dog.fazerSom();
        Gato cat = new Gato("Meimei", 5);
        cat.exibirDados();
        cat.fazerSom();


        // ativ 8
        Professor prof = new Professor("Edinho", 25, "Matemática");
        prof.apresentar();


        // ativ 9
        Funcionario fun = new Funcionario("Carlos", 1800.20);
        fun.exibirDados();
        fun.calcularBonus();
        Gerente ger = new Gerente("Edu", 2550.25);
        ger.exibirDados();
        ger.calcularBonus();

    }
}
