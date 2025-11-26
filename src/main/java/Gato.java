import java.util.Arrays;
import java.util.List;

public class Gato extends Animal{

    private static final String[] DOENCAS = {"Cinomose", "Parvovirose", "Leptospirose", "Dermatite", "Otite"};

    public Gato(String nome, int idade, String raca) throws ValidacaoException {
        super(nome, idade, raca);
    }

    @Override
    public boolean podeTerDoenca(String doenca) {
        return Arrays.asList(DOENCAS).contains(doenca);
    }

    @Override
    public String[] getDoencasPossiveis() {
        return DOENCAS;
    }
}
