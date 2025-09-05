package Prova;

public class Animal {
        String nome;
        int idade;

        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void fazerSom() {
            System.out.println(nome + " de " + idade + " anos fez algum som.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Animal("Cachorro", 3);
            animal.fazerSom();
        }
    }

}
