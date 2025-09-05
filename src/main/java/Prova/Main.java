package Prova;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", 1992);
        carro.ExibirDados();


        Pessoa pessoa = new Pessoa("Toreto", 19);
        pessoa.Apresentar();


        Produto produto1 = new Produto("Abacaxi");
        Produto valorproduto = new Produto(8);
        produto1.Produto1();
        valorproduto.valorproduto();


        ContaBancaria conta = new ContaBancaria("Toreto", 150.00);
        conta.dadosconta();
        conta.Depositar(200.00);
        conta.Sacar(57.65);
        conta.dadosconta();


        Animal animal = new Animal("Bizarro", 168);
        animal.FazerSom();


        Pessoa pessoa1 = new Pessoa("Zabuza", 74);
        pessoa1.Apresentar();
        Aluno aluno = new Aluno("Jiraia", 23, "514568");
        aluno.apresentarse();


        Cachorro cachorro = new Cachorro();
        cachorro.FazerSom();
        Gato gato = new Gato();
        gato.FazerSom();


        Professor professor = new Professor("Stanley", 52, "Drift");
        professor.Apresentar();


        Funcionario funcionario = new Funcionario("Scott", 3869.00);
        System.out.println("Bônus do funcionário " + funcionario.getNome() + ": R$" + funcionario.calcularBonus());
        Gerente gerente = new Gerente("Carletto", 5648.00);
        System.out.println("Bônus do gerente " + gerente.getNome() + ": R$" + gerente.calcularBonus());


    }


}
