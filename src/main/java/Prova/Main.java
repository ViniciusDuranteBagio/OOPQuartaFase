package Prova;

public class Main {

    public static void main(String[] args) {

        //questão 1

        Carro c = new Carro();
        c.marca = "NIssan";
        c.ano = 1980;
        c.exibirDados();

        // questão 2

        Pessoa People = new Pessoa();
        People.Nome = "Tamaravilhosa";
        People.Idade = 25;
        People.apresentar();

        //questao 3

        Produto produtoA = new Produto("parafuso", 25);
        Produto produtoB = new Produto("microfone", 108);

        produtoA.exibirInfo();
        produtoB.exibirInfo();

//questao 4

        ContaBancaria conta = new ContaBancaria("jungkook");

        conta.depositar(500);
        conta.sacar(100);
        conta.exibirSaldo();


//questao 5


    Animal animal = new Animal("Bolota", 25);
    animal.fazerSom();


    //questão 6

        Aluno aluno = new Aluno();
        aluno.nome = "João Silva";
        aluno.idade = 20;
        aluno.matricula = 2023001;

        aluno.apresentar();


        //questao 7
        Cachorro cao = new Cachorro();
        cao.fazerSom();

        Gato gato = new Gato();
        gato.fazerSom();

//questão 8

        Professor professor = new Professor();

        professor.disciplina= "historia";
        professor.apresentar();


        //questao 9

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Rebecca";
        funcionario.salario = 3000.00;

        Gerente gerente = new Gerente();
        gerente.nome = "RM";
        gerente.salario = 5000.00;

        System.out.println("Bônus de " + funcionario.nome + ": R$" + funcionario.calcularBonus());
        System.out.println("Bônus de " + gerente.nome + ": R$" + gerente.calcularBonus());


}
}
