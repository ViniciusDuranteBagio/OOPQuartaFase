package Prova;

public class Main {
    public static void main(String[] args) {
        carro carro1 = new carro();
        carro1.marca = "toyota";
        carro1.ano = 2011;
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);

        pessoa pessoa1 = new pessoa();
        pessoa1.nome = "Guilherme";
        pessoa1.idade = 20;
        pessoa1.metodoApresentar();

        produto produto1 = new produto();
        produto1.nome = "nescau";
        produto1.preco = 10.0;

        System.out.println(produto1.nome);
        System.out.println(produto1.preco);

        produto produto2 = new produto();
        produto2.nome = "cichete";
        produto2.preco = 2.0;

        System.out.println(produto2.nome);
        System.out.println(produto2.preco);

        contaBancaria contaBancaria1 = new contaBancaria();
        contaBancaria1.titular = "caua";
        contaBancaria1.saldo = 100;
        contaBancaria1.metodoDepositar(200);

        contaBancaria contaBancaria2 = new contaBancaria();
        contaBancaria2.titular = "vinicius durante";
        contaBancaria2.saldo = 10000;
        contaBancaria2.metodoSacar(2000);

        animal animal1 = new animal();
        animal1.nome = "cachorro";
        animal1.idade = 10;
        animal1.metodofazerSom();

        aluno aluno1 = new aluno();
        aluno1.nome = "dacio";
        aluno1.idade = 15;
        aluno1.matricula = 1010;
        aluno1.metodoApresentar();

        cachorro cachorro1 = new cachorro();
        cachorro1.metodofazerSom();

        gato gato1 = new gato();
        gato1.metodofazerSom();

        professor professor1 = new professor();
        professor1.nome = "clavisson";
        professor1.idade = 42;
        professor1.disciplina = "Algoritmos e logica de programacao";
        professor1.metodoApresentar();

        gerente gerente1 = new gerente();
        gerente1.nome = "davi";
        gerente1.salario = 2700;
        gerente1.calcularBonus();

    }
}
