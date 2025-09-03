/* - Crie uma classe Cachorro que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Cachorro latindo.
- Crie uma classe Gato que vai herdar de Animal, e Sobrescreva o metodo FazerSom() para o som de um Gato miando.
- Na Main crie um objeto de Cachorro e um de Gato e faça eles fazerem o som.
*/

class Animal {
    String nome;
    int idade;

    void fazerSom() {
        System.out.println(nome + ", de " + idade + " anos, fez algum som.");
    }
}
class Cachorro extends Animal {
    @Override
    void fazerSom() {       
        System.out.println(nome + ", de " + idade + " anos, latiu.");
    }
}

class Gato extends Animal {

    @Override
    void fazerSom() {       
        System.out.println(nome + ", de " + idade + " anos, miou.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.nome = "Rex";
        meuCachorro.idade = 5;  
        meuCachorro.fazerSom();

        Gato meuGato = new Gato();
        meuGato.nome = "Mimi";
        meuGato.idade = 3;  
        meuGato.fazerSom();
    }
}


