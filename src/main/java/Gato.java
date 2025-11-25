package TrabalhoFinal;

class Gato extends Animal {

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    public String[] getDoencasComuns() {
        return new String[]{"PIF", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"};
    }
}