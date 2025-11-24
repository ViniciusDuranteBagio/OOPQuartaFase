package Trabalho_final;

public class Gato extends Animal {
    private static final String[] DOENCAS = {"PIF (Peritonite Infecciosa Felina)", "Rinotraqueíte", "Calicivirose", "Panleucopenia", "Otite"};

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencas() {
        return DOENCAS;
    }
}
