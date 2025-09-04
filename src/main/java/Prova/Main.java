package Prova;

public class Main {
    public static void main(String[] args) {
        carro Carro = new carro();


        Carro.marca = "Wolksvagen Gol";
        Carro.ano = 2010;

        Carro.exibirDados();

        Pessoa p1 = new Pessoa() {
            @Override
            void apresentar() {

            }
        };
        p1.nome = "Ruan";
        p1.idade = 21;
        p1.Apresentar();

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 3100.00;


        Produto produto2 = new Produto();
        produto2.nome = "Celular";
        produto2.preco = 7000.00;


        System.out.println("\nProduto 1");
        produto1.ExibirDados();

        System.out.println("\nProduto 2");
        produto2.ExibirDados();


        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Ruan";
        conta.saldo = 8000.00;

        conta.exibirDados();

        System.out.println("\nOperações");
        conta.depositar(500);
        conta.sacar(300);
        conta.sacar(1500);

        System.out.println("\nSaldo");
        conta.exibirDados();

            Animal cachorro = new Animal();
            cachorro.nome = "\nPitocoBrabo";
            cachorro.idade = 6;


            cachorro.fazerSom();


            Pessoa p3 = new Pessoa();
            p3.nome = "Carlos";
            p3.idade = 22;
            p3.apresentar();


            Aluno a1 = new Aluno();
            a1.nome = "Ana";
            a1.idade = 20;
            a1.matricula = "2025";
            a1.apresentar();

        Cachorro dog = new Cachorro();
        dog.nome = "\nDurante";
        dog.idade = 4;


        Gato cat = new Gato();
        cat.nome = "\nMorgana";
        cat.idade = 2;


        dog.fazerSom();
        cat.fazerSom();

        Professor prof = new Professor();
        prof.nome = "João";
        prof.idade = 18;
        prof.disciplina = "Matemática";


        prof.apresentar();

        Funcionario f1 = new Funcionario();
        f1.nome = "\nCarlos";
        f1.salario = 3000;


        Gerente g1 = new Gerente();
        g1.nome = "\nAna";
        g1.salario = 5000;


        System.out.println(f1.nome + " - Bônus: " + f1.calcularBonus());
        System.out.println(g1.nome + " - Bônus: " + g1.calcularBonus());
    }
}

