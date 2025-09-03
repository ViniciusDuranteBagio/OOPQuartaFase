public class Main {
    public static void main(String[] args) {

        // Teste com Carro
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setAno(2020);
        carro1.exibirDados();

        // Teste com Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zéca");
        pessoa1.setIdade(25);
        pessoa1.apresentar();

        //teste com Produto
        Produto produto1 = new Produto();
        produto1.setNome("Notebook");
        produto1.setPreco(3500.00);

        Produto produto2 = new Produto();
        produto2.setNome("Smartphone");
        produto2.setPreco(1800.00);

        produto1.exibirDados();
        produto2.exibirDados();

        //teste ContaBancaria
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("Jemerson");

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(800);

        conta.exibirDados();

        //Teste com Animal
        Animal animal1 = new Animal();
        animal1.setNome("Cachorro");
        animal1.setIdade(3);

        animal1.fazerSom();

        //Teste Pessoa e Aluno
        Pessoa pessoa2 = new Pessoa();
        pessoa1.setNome("Vinicius");
        pessoa1.setIdade(40);
        pessoa1.apresentar();

        Aluno1 aluno1 = new Aluno1();
        aluno1.setNome("Durante");
        aluno1.setIdade(20);
        aluno1.setMatricula("A12345");
        aluno1.apresentar();

        //Teste Cachorro e Gato
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Thor");
        cachorro.setIdade(4);
        cachorro.fazerSom();

        Gato gato = new Gato();
        gato.setNome("Miau");
        gato.setIdade(2);
        gato.fazerSom();

        //Teste com Professor
        Professor prof = new Professor();
        prof.setNome("Bagio");
        prof.setIdade(35);
        prof.setDisciplina("Matemática");

        prof.apresentar();

        //Teste com Funcionário e Gerente
        Funcionario func = new Funcionario();
        func.setNome("Carlos");
        func.setSalario(3000);
        func.exibirDados();

        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSalario(5000);
        gerente.exibirDados();

            }
        }




















