package Aula2;

public class MainHeroi {
    public static void main(String[] args) {
        Heroi h1 = new Heroi("Akra", "Elfo Azul");
        Heroi h2 = new Heroi("Gabriel", "Elfo Verde");
        Heroi h3 = new Heroi("Erinye", "Bruxa-Vampira");

        h1.lutar();
        h2.lutar();
        h3.lutar();
    }
}
