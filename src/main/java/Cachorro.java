public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    private String[] doencas = {
        "Cinomose",
        "Parvovirose",
        "Leptospirose",
        "Dermatite",
        "Otite"
    };

    @Override
    public String[] getDoencasComuns() {
        return doencas;
    }

}
