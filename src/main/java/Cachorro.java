package TrabalhoFinal;

class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    public String[] getDoencasComuns() {
        return new String[]{"Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"};
    }
}