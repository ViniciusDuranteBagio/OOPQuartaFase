public class Gato extends Animal {
    private static final String[] DOENCAS = {
            "PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte",
            "Calicivirose", "Panleucopenia", "Otite"
    };

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return DOENCAS;
    }

    @Override
    public String getTipo() {
        return "Gato";
    }
}