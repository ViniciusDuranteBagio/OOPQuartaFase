
public class Gato extends Animal {

    private static final String[] DOENCAS_COMUNS = {
            "PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"
    };

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasComuns() {
        return DOENCAS_COMUNS;
    }
}