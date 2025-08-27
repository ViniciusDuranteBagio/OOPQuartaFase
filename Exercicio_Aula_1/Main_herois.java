package classe.Exercicio_Aula_1;

public class Main_herois {
    public static void main(String[] args) {

        Herois heroi1 = new Herois("Arthur", "Guerreiro");
        Herois heroi2 = new Herois("Merlin", "Mago");
        Herois heroi3 = new Herois("Legolas", "Arqueiro");

        heroi1.lutar();
        heroi2.lutar();
        heroi3.lutar();


    }
}
