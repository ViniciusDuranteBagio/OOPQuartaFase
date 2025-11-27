public class Cachorro extends Animal {
    private static final String[] DOENCAS = {
            "Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"
    };

    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return DOENCAS;
    }

    @Override
    public String getTipo() {
        return "Cachorro";
    }
}
