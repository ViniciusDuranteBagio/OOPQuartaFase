import main.java.Prova.Funcionario;
import main.java.Prova.Gerente;

public class Main {
    public static void main(String[] args) {

        // 1
        Carro carro1 = new Carro();
        carro1.marca = "Fusca";
        carro1.ano = 1982;

        carro1.exibirDados();
    }

        // 2
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Salete";
        pessoa1.idade = 12;

        pessoa1.apresentar();


        //3
        Produto produto1 = new Produto();
        produto1.nome = "Vassoura";
        produto1.preco = 26.90;

        Produto produto2 = new Produto();
        produto2.nome = "Espanador";
        produto2.preco = 11.25;

        System.out.println("Produto 1: " + produto1.nome + " - R$ " + produto1.preco);
        System.out.println("Produto 2: " + produto2.nome + " - R$ " + produto2.preco);



        // 4
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Maria";
        conta1.saldo = 950.00;
        conta1.exibirDados();
        conta1.depositar(30);
        conta1.sacar(20);
        conta1.sacar(1500);

        conta1.exibirDados();



        //5
        Animal animal1 = new Animal();
        animal1.nome = "Coala";
        animal1.idade = 2;

        animal1.fazerSom();


        // 6
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João Luís";
        aluno1.idade = 31;
        aluno1.matricula = "489999";
        aluno1.apresentar();



        //7
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Sirius";
        cachorro1.idade = 6;

        Gato gato1 = new Gato();
        gato1.nome = "Blair";
        gato1.idade = 7;

        cachorro1.fazerSom();
        gato1.fazerSom();



         //8
        Professor professor1 = new Professor();
        professor1.nome = "Barbara";
        professor1.idade = 21;
        professor1.disciplina = "Dança";
        professor1.apresentar();




        //9
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Marcos";
        funcionario1.salario = 2000.0;
        System.out.println("Funcionário: " + funcionario1.nome);
        System.out.println("Bônus: R$ " + funcionario1.calcularBonus());

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Roger";
        gerente1.salario = 6000.0;
        System.out.println("Gerente: " + gerente1.nome);
        System.out.println("Bônus: R$ " + gerente1.calcularBonus());
    }

}
