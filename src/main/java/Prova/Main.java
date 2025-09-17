package Prova;

public class Main {
    public static void main(String[] args) {
/*Questão 1 (1,00)
Crie uma classe chamada Carro com os atributos marca e ano.
Depois, na classe main, crie um objeto dessa classe e atribua valores aos atributos.
 Crie um método ExibirDados e mostre esses valores para o usuario.
        Carro valoresCarro= new Carro("Ford",2020);
        valoresCarro.ExibirDados();*/
  /*Questão 2 (1,00)
Crie uma classe chamada Pessoa com os atributos nome e idade, e um método apresentar() que imprime:
 “Olá, meu nome é e tenho anos.”
        Pessoa atributos = new Pessoa("Maria",24);
        atributos.apresentar();*/
/*Questão 3 (1,00)
Crie uma classe Produto com os atributos nome e preco.
 No classe main, crie dois objetos dessa classe e imprima os valores de cada um.
        Produto produto1= new Produto("Bota",150.00);
        Produto produto2 = new Produto("Tenis",250.00);
        produto1.MostrarProdutos();
        produto2.MostrarProdutos();*/
   /*Questão 4 (1,00)
Crie uma classe ContaBancaria com os atributos titular e saldo. Adicione métodos depositar(double valor)
e sacar(double valor) que atualizam o saldo. O saldo nunca pode ficar negativo.
        ContaBancaria conta= new ContaBancaria("João Da Silva",45000.50);
        conta.Depositar(200);
        conta.Sacar(50000);
        conta.Sacar(0);*/
        /*Questão 5 (1,00)
Crie uma classe Animal com os atributos nome e idade, e um método fazerSom().
 Na classe main, crie um objeto Animal e chame o método para fazer som,
  mostrando o nome a idade do animal, a frase "fez algum som".
        Animal chamarbicho= new Animal("Girafa",5);
        chamarbicho.fazerSom();*/
        /*Questão 6 (1,00)
Crie uma classe Pessoa, com os atributos nome e idade, com um método apresentar() que vai falar "Olá sou, {nome},
 e minha tenho {idade} anos".Crie uma classe Aluno que herda de Pessoa. Adicione o atributo matricula.
  Sobrescreva o método apresentar() para imprimir também a matrícula.
       Aluno aluno= new Aluno("Maria",23,222);
       aluno.apresentar();*/
        /*Questão 7 (1,00)
Crie uma classe Cachorro que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um
 Cachorro latindo Crie uma classe Gato que vai herdar de Animal, e Sobrescreva o metodo FazerSom()
  para o som de um Gato miando.Na Main crie um objeto de Cachorro e um de Gato e
  faça eles fazerem o som.*/
        Cachorro latir= new Cachorro("Bob",1);
        Gato miar = new Gato("Amorinha",3);
         latir.fazerSom();
         miar.fazerSom();

        /*Questão 8 (1,00)
Crie uma classe Professor que herda de Pessoa.
Adicione o atributo disciplina.
Sobrescreva o método apresentar() para imprimir também a disciplina.
        Professor chamarProf= new Professor("João",22,"POO");
        chamarProf.apresentar();*/

        /*Questão 9 (2)
Crie uma classe Funcionario com atributos nome e salario.
Crie um método calcularBonus() que retorna 10% do salário.
Crie uma subclasse Gerente que sobrescreve esse método para retornar 20% do salário.*/

        Funcionario F1= new Funcionario("Ana",2400);
        Gerente F2= new Gerente("Maria",3000);
        F1.CalcularBonus();
        F2.CalcularBonus();
        System.out.println("Folha de Pagamento\n"+F1.nome+" : "+F1.salario+"+"+F1.CalcularBonus()+"\n "
        +F2.nome+" : "+F2.salario+"+"+F2.CalcularBonus());

    }
}
