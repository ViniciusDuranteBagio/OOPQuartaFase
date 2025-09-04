package OOPQuartaFase.src.Prova;

public class Main {
    public static void main(String[] args) {

        //questão1
        Carro carro = new Carro();
        carro.marca = "Honda";
        carro.ano = 2025;
        carro.exibirDados();

        //questão2
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Andrei";
        pessoa.idade = 20;
        pessoa.apresentar();

        //questao3
        Produto pdt1= new Produto();
        pdt1.nome = "Mouse";
        pdt1.preço = 80;

        Produto pdt2 = new Produto();
        pdt2.nome = "Teclado";
        pdt2.preço = 50;

        //questão4
        //> Está na classe

        //questão5
        Animal animal = new Animal();
        animal.nomeAnimal = "Garfield";
        animal.idadeAnimal = 2;
        animal.fazerSom();

        //questão6
        Pessoa p1 = new Pessoa();
        p1.nome = "Vinicius";
        p1.idade = 25;
        p1.apresentar();

        Aluno a1 = new Aluno();
        a1.nome = "Andrei";
        a1.idade = 20;
        a1.apresentar();

        //questão7
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();

        Gato gato = new Gato();
        gato.fazerSom();

        //questão8
        Professora professora = new Professora();
        professora.nome = "Ana";
        professora.idade = 32;
        professora.apresentar();

        //questao9

        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.salario = 2000;
        f1.calcularBonus();
        System.out.println(f1.nome + " Recebeu um bônus de R$" + f1.calcularBonus());

        Gerente g1 = new Gerente();
        g1.nome = "Andrei";
        g1.salario = 5000;
        g1.calcularBonus();
        System.out.println(g1.nome + " Recebeu um bônus de R$" + g1.calcularBonus());



    }
}
