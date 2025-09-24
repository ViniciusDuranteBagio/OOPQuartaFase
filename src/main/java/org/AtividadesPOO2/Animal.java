package org.AtividadesPOO2;
//Atividade04 e 05 HerançaAula04
/*public class Animal {
        private String nome;
        private int idade;

        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public void dormir() {
            System.out.println("O animal está dormindo");
        }
    }
class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    public void latir() {
        System.out.println("O cachorro está latindo");
    }
}*/
public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void dormir() {
        System.out.println("O animal está dormindo");
    }
}
class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void latir() {
        System.out.println("O cachorro está latindo");
    }

    public void brincar() {
        System.out.println("O cachorro " + nome + " está brincando!");
    }
}