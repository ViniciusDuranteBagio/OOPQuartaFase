package Animal;

public class Gato extends Animal {

    // Lista de doenças mais comuns em gatos
    private static final String[] DOENCAS = {
            "PIF (Peritonite Infecciosa Felina)",
            "Rinotraqueíte",
            "Calicivirose",
            "Panleucopenia",
            "Otite"
    };

    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        // Retorna uma cópia do array para preservar encapsulamento
        return DOENCAS.clone();
    }

    @Override
    public String toString() {
        return "Gato - " + super.toString();
    }
}
