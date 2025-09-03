package Prova;

public class Main7 {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Bigo";
        cachorro1.idade = 7;

        Gato gato1 = new Gato();
        gato1.nome = "Lua";
        gato1.idade = 3;

        cachorro1.fazerSom();
        gato1.fazerSom();
    }
}
