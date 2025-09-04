package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.ano = 2004;
        carro1.exibirDados();
        System.out.println();


        Pessoa pessoa1 = new Pessoa("Thiago", 19);
        pessoa1.apresentar();
        System.out.println();


        Produto produto1 = new Produto("Notebook", 2500);
        Produto produto2 = new Produto("Mouse", 300);
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        System.out.println();


        ContaBancaria conta1 = new ContaBancaria("Fabio");
        conta1.depositar(300);
        conta1.exibirSaldo();
        conta1.sacar(250);
        conta1.exibirSaldo();
        conta1.sacar(60);
        System.out.println();


        Animal leao = new Animal("Leão",12);
        leao.fazerSom();
        System.out.println();


        Aluno aluno1 = new Aluno("Roberto", 13, 450);
        aluno1.apresentar();
        System.out.println();


        Cachorro cachorro1 = new Cachorro("Bob", 13);
        cachorro1.fazerSom();
        Gato gato1 = new Gato("Xande",15);
        gato1.fazerSom();
        System.out.println();


        Professor professor1 = new Professor("Vinicius", 24, "Programação Orientada à Objetos");
        professor1.apresentar();
        System.out.println();


        Funcionario func1 = new Funcionario("Geraldo", 1900);
        Gerente gerente1 = new Gerente("Claudio", 3000);
        func1.calcularBonus();
        gerente1.calcularBonus();
    }
}
