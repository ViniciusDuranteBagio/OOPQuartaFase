public class Gato extends Animal {

    private static final String[] DOENCAS = {
            "PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"
    };

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getPossiveisDoencas() {
        return DOENCAS;
    }

    @Override
    public String toString() {
        return "Gato\n" + super.toString();
    }
}