public class Gato extends Animal {
    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    private String[] doencas = {
            "PIF",
            "Rinotraqueíte",
            "Calicivirose",
            "Panleucopenia",
            "Otite"
    };

    @Override
    public String[] getDoencasComuns() {
        return doencas;
    }

}
