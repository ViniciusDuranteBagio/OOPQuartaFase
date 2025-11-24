public class Cachorro extends Animal {

    public Cachorro(String nome, String idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencas() {
        return new String[]{
                "Cinomose",
                "Parvovirose",
                "Leptospirose",
                "Dermatite",
                "Otite"
        };
    }
}
