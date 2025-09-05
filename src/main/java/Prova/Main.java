package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.ano = 2025;
        carro1.exibirDados();
        System.out.println("-----------------------------------------------------------------------------------------");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.apresentar("Jonas",20);
        System.out.println("-----------------------------------------------------------------------------------------");

        Produto produto1 = new Produto("Iphone 15",4100);
        Produto produto2 = new Produto("Iphone 16", 4600);
        produto1.exibirDetalhes();
        produto2.exibirDetalhes();
        System.out.println("-----------------------------------------------------------------------------------------");

        ContaBancaria conta1 = new ContaBancaria("Jonas");
        conta1.exibirSaldo();
        conta1.depositar(-2);
        conta1.depositar(100);
        conta1.exibirSaldo();
        conta1.sacar(150);
        conta1.sacar(50);
        conta1.exibirSaldo();
        System.out.println("-----------------------------------------------------------------------------------------");

        Animal animal1 = new Animal("Gato", 4,"siames");
        animal1.fazerSom();
        System.out.println("-----------------------------------------------------------------------------------------");

        Aluno aluno1 = new Aluno("Maria", 20, 2050);
        aluno1.apresentar();
        System.out.println("-----------------------------------------------------------------------------------------");

        Cachorro cachorro1 = new Cachorro("Rex", 3, "salsicha");
        cachorro1.fazerSom();
        System.out.println("-----------------------------------------------------------------------------------------");

        Gato gato1 = new Gato("Frajola", 4, "American Shorthair");
        gato1.fazerSom();
        System.out.println("-----------------------------------------------------------------------------------------");

        Professor professor1 = new Professor("Vinicius",24,"Programação orientada a objeto 1");
        professor1.apresentar();
        System.out.println("-----------------------------------------------------------------------------------------");

        Funcionario funcionario1 = new Funcionario("Jonas", 1000);
        funcionario1.calcularBonus();
        Gerente gerente1 = new Gerente("Roberto", 5000);
        gerente1.calcularBonus();




    }
}
