package Prova;

// QUESTÂO NUMERO UM

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.ano = 2003;
        //carro1.ExibirDados();


        // QUESTÂO NUMERO DOIS

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome= "Gustavo Mariot";
        pessoa1.idade = 19;
        // pessoa1.apresentar();

        // QUESTÂO NUMERO TRES

        Produto produto1 = new Produto();
        produto1.nome= "Bermuda";
        produto1.preco = 49;

        Produto produto2 = new Produto();
        produto2.nome = "Oculos";
        produto2.preco = 99;

        //produto1.ExibirDados();
        //produto2.ExibirDados();

        // QUESTÂO NUMERO QUARTRO

        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Gustavo";
        conta1.saldo = 90.00;
        //conta1.Depositar(900);
        //conta1.ExibirSaldo();
        //conta1.sacar(1000);
        //conta1.ExibirSaldo();


        // QUESTÂO NUMERO CINCO

        Animal animal1 = new Animal();
        animal1.nome = "Jaguatirica";
        animal1.idade = 4;
        //animal1.fazerSom();



        //QUESTAO NUMERO SEIS

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome= "Gustavo Mariot";
        pessoa2.idade = 19;
        //pessoa2.apresentar();

        Aluno aluno1 = new Aluno();
        aluno1.nome= "Cleiton Arrasta";
        aluno1.idade = 15;
        aluno1.matricula = 11231523;
        //aluno1.apresentar();



        //QUESTAO SETE

        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome= "Jake";
        cachorro1.idade = 10;
        //cachorro1.fazerSom();

        Gato gato1 = new Gato();
        gato1.nome= "Mel";
        gato1.idade = 5;
        //gato1.fazerSom();

        //QUESTAO OITO

        Professor professor1 = new Professor();
        professor1.nome = "Vinicius Bagio";
        professor1.idade = 20;
        professor1.disciplina = "Programação";
        //professor1.apresentar();

        //QUESTAO NOVE

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Gustavo";
        funcionario1.salario = 80.00;
        funcionario1.CalcularBonus();

        Gerente gerente1 = new Gerente();
        gerente1.nome = "Vinicius";
        gerente1.salario = 80.00;
        gerente1.CalcularBonus();

    }
}
