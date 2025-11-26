public class Gato extends Animal {

    public Gato(String apelido, int anos, String tipoRaca) {
        super(apelido, anos, tipoRaca);
    }

    @Override
    public String[] doencas() {
        return new String[] {
                "PIF",
                "Rinotraqueíte",
                "Calicivirose",
                "Panleucopenia",
                "Otite"
        };
    }
}