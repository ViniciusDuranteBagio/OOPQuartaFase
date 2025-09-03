package Prova;

public class Main {
    public static void main(String[] args) {

        //questao 1
        System.out.println("============ Questao 1 ============");
        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setAno(2018);
        carro.exibirDados();
        System.out.println("\n----------------------------------------------\n");

        //questao 2
        System.out.println("============ Questao 2 ============");
        Pessoa pessoa = new Pessoa("Renan", 20);
        pessoa.apresentar();
        System.out.println("\n----------------------------------------------\n");

        //questao 3
        System.out.println("============ Questao 3 ============");
        Produto produto1 = new Produto();
        produto1.setNome("Omo");
        produto1.setPreco(24.99);
        produto1.imprimirValores();

        Produto produto2 = new Produto();
        produto2.setNome("Bombril");
        produto2.setPreco(5.99);
        produto2.imprimirValores();
        System.out.println("\n----------------------------------------------\n");

        //questao 4
        System.out.println("============ Questao 4 ============");
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Renan Lucktemberg");
        System.out.println("Titular: " + conta.getTitular());

        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(300);
        System.out.println("\n----------------------------------------------\n");

        //questao 5
        System.out.println("============ Questao 5 ============");
        Animal animal = new Animal();
        animal.setNome("Vaca");
        animal.setIdade(4);
        animal.imprimirInformacoes();
        animal.fazerSom();
        System.out.println("\n----------------------------------------------\n");

        //questao 6
        System.out.println("============ Questao 6 ============");
        Aluno aluno1 = new Aluno("Renan", 20, "248117");
        aluno1.apresentar();
        System.out.println("\n----------------------------------------------\n");

        //questao 7
        System.out.println("============ Questao 7 ============");
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom();

        Gato gato = new Gato();
        gato.fazerSom();
        System.out.println("\n----------------------------------------------\n");

        //questao 8
        System.out.println("============ Questao 8 ============");
        Professor professor = new Professor("Renan", 22, "Filosofia");
        professor.apresentar();
        System.out.println("\n----------------------------------------------\n");

        //questao 9
        System.out.println("============ Questao 9 ============");
        Funcionario funcionario = new Funcionario("Renan", 7839.67);
        funcionario.exibirInfoFuncionario();
        funcionario.calcularBonus();

        Gerente gerente = new Gerente("Robson", 8500.00);
        gerente.exibirInfoFuncionario();
        gerente.calcularBonus();
        System.out.println("\n---------------------------------------------\n");


    }
}
