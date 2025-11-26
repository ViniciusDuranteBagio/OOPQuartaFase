public class Cachorro extends Animal {

    public Cachorro(String apelido, int anos, String tipoRaca) {
        super(apelido, anos, tipoRaca);
    }

    @Override
    public String[] doencas() {
        return new String[] {
                "Cinomose",
                "Parvovirose",
                "Leptospirose",
                "Dermatite",
                "Otite"
        };
    }
}