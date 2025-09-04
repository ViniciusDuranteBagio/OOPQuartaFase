package Prova;

public class Main {
    public static void main(String[] args) {
// Questão 1
        Carro meuCarro = new Carro();
        meuCarro.marca = "Peugeout";
        meuCarro.ano = 2015;

        meuCarro.mostrarDados();

        //Questão 2
        Pessoa p1 = new Pessoa();

        p1.nome = "Danty ";
        p1.idade = 30;
p1.apresentar();

//Questão 3
Produto produto1 = new Produto();

produto1.nome = "Camiseta ";

produto1.preco = 29.90;

Produto produto2 = new Produto();

produto2.nome = "Calça ";

produto2.preco = 99.90;

        System.out.println("Produto1: " +produto1.nome + "R$ " + produto1.preco);
        System.out.println("Produto2: " +produto2.nome + "R$ " +produto2.preco);

        //Questão 4

        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Pedro da Silva";
        conta.saldo = 1000.0;

        conta.mostrarSaldo();
        conta.depositar(500);
        conta.mostrarSaldo();
        conta.sacar(200);
        conta.mostrarSaldo();
        conta.sacar(1500);
        conta.mostrarSaldo();

        //Questão 5
Animal meuAnimal = new Animal();
meuAnimal.nome = "Cachorro";
meuAnimal.idade = 2;
meuAnimal.fazerSom();

//Questão 6

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Carlos";
        pessoa.idade = 40;
        pessoa.apresentar();

        Aluno aluno = new Aluno();
        aluno.nome = "Ana";
        aluno.idade = 20;
        aluno.matricula = "2025001";
        aluno.apresentar();

        //Questão 7


                Cachorro cachorro = new Cachorro();
                cachorro.nome = "Rex";
                cachorro.idade = 4;

                Gato gato = new Gato();
                gato.nome = "Mimi";
                gato.idade = 3;

                cachorro.fazerSom();
                gato.fazerSom();

                //Questão 8

        Professor prof = new Professor();
        prof.nome = "Maria";
        prof.idade = 45;
        prof.disciplina = "Matemática";
        prof.apresentar();

        //Questão 9
        Funcionario func = new Funcionario();
        func.nome = "João";
        func.salario = 3000.0;

        Gerente gerente = new Gerente();
        gerente.nome = "Ana";
        gerente.salario = 7000.0;

        System.out.println(func.nome + " tem bônus de R$ " + func.calcularBonus());
        System.out.println(gerente.nome + " tem bônus de R$ " + gerente.calcularBonus());
    }
}
