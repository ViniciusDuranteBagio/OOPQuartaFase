package Prova;

public class Main {
    public static void main(String[] args) {

        System.out.println("Questão 1: ");
        Carro fastback = new Carro("Fiat", 2024);
        fastback.exibirDados();
        System.out.println();


        System.out.println("Questão 2: ");
        Pessoa pessoa1 = new Pessoa("Lua", 26);
        pessoa1.apresentar();
        System.out.println();


        System.out.println("Questão 3: ");
        Produto prod1 = new Produto("Chocolate", 5.50);
        Produto prod2 = new Produto("Sorvete", 18.50);
        prod1.informacoes();
        prod2.informacoes();
        System.out.println();


        System.out.println("Questão 4: ");
        ContaBancaria conta1 = new ContaBancaria("Lua de tal");
        conta1.exibirSaldo();
        conta1.depositar(2500);
        conta1.exibirSaldo();
        conta1.sacar(3000);
        conta1.sacar(250);
        conta1.exibirSaldo();
        System.out.println();


        System.out.println("Questão 5: ");
        Animal animal1 = new Animal("Gato", 3);
        animal1.fazerSom();
        System.out.println();


        System.out.println("Questão 6: ");
        Aluno aluno1 = new Aluno("Lara", 20, 123456);
        aluno1.apresentar();
        System.out.println();


        System.out.println("Questão 7: ");
        Cachorro cachorro1 = new Cachorro("Jesebel", 3);
        cachorro1.fazerSom();
        Gato gato1 = new Gato("Mingau", 4);
        gato1.fazerSom();
        System.out.println();


        System.out.println("Questão 8: ");
        Professor prof1 = new Professor("Vinicius", 24, "Programação Orientada a Objeto");
        prof1.apresentar();
        System.out.println();

        System.out.println("Questão 9: ");
        Funcionario func1 = new Funcionario("Jota", 3200);
        func1.calcularBonus();
        Gerente ger1 = new Gerente("Ka", 7600);
        ger1.calcularBonus();
        System.out.println();



    }
}
