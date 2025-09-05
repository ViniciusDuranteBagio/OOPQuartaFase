package main.java.Prova;

public class Main {
    public static void main(String[] args) {
        /* Questão 1

        Carro carro = new Carro();
        carro.marca = "bmw";
        carro.ano = 2000;
        carro.exibirDados();
*/

/* Quetão 2
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "joao";
        pessoa.idade = 20;
        pessoa.Apresentar();

*/
        /* Questão 3

        Produto produto1 = new Produto();
        produto1.nome = "cocacola";
        produto1.preco = 5.50;

        Produto produto2 = new Produto();
        produto2.nome = "pastel";
        produto2.preco = 6.50;

        System.out.println("o produto é " + produto1.nome + " e custa " + produto1.preco + " reais");
        System.out.println("o produto é " + produto2.nome + " e custa " + produto2.preco + " reais");

*/
/* Questão 4
        ContaBancaria conta = new ContaBancaria();
        conta.setTitular("joao");
        conta.setSaldo(1000.0);

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo final: R$ " + conta.getSaldo());
        conta.sacar(2000);

 */

        /* Questão 6
        Animal animal = new Animal();
        animal.especie = "vaca";
        animal.nome = "mimosa";
        animal.idade = 5;
        animal.fazerSom();


         */
       /* Questão 6
        Aluno aluno = new Aluno();
        aluno.nome = "joao";
        aluno.idade = 20;

        aluno.setMatricula(111111);
        aluno.Apresentar();
        */

      /* Questão 7
        Cachorro cachorro = new Cachorro();
        cachorro.especie = "cachorro";
        cachorro.nome = "Policardo";
        cachorro.idade = 3;
        cachorro.fazerSom();

        Gato gato = new Gato();
        gato.especie = "gato";
        gato.nome = "Lalau";
        gato.idade = 4;
        gato.fazerSom();

       */
/* Questão 8
        Professor professor = new Professor();
        professor.nome = "vinicius";
        professor.idade = 24;
        professor.disciplina = "POO";
        professor.Apresentar();

 */
// Questão 9
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("joao");
        funcionario.setSalario(2000.0);
        System.out.println(funcionario.getNome() + " recebe um valor que contando com o bonus um sálario de: R$ " + funcionario.calcularBonus());

        Gerente gerente = new Gerente();
        gerente.setNome("jorge");
        gerente.setSalario(5000.0);
        System.out.println(gerente.getNome() + " recebe um valor que contando com o bonus um sálario de: R$ " + gerente.calcularBonus());
    }
}






