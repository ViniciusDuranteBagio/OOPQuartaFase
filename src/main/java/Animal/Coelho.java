package Animal;

public class Coelho extends Animal {

    // Lista de doenças mais comuns em coelhos
    private static final String[] DOENCAS = {
            "Mixomatose", "Pasteurelose", "Sarna Auricular", "Pododermatite", "Coccidiose"
    };

    public Coelho(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        // Retorna uma cópia para proteger o array original
        return DOENCAS.clone();
    }

    @Override
    public String toString() {
        return "Coelho - " + super.toString();
    }
}
