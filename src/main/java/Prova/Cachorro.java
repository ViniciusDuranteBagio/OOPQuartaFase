package Prova;
//Crie uma classe Cachorro que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Cachorro latindo.
//Crie uma classe Gato que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Gato miando.
//Na Main crie um objeto de Cachorro e um de Gato e faça eles fazerem o som.
    public class Cachorro extends Animal   {

        public Cachorro(String nome, Integer idade) {
            super(nome, idade);
        }
        public void fazerSom(){
            System.out.println("Meu cachorro " + getNome() + ", tem " + getIdade() + " anos e latiu");
    }
}
