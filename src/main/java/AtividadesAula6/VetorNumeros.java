package AtividadesAula6;
import javax.swing.JOptionPane;

public class VetorNumeros {
    private int[] numeros;

    public VetorNumeros() {
        numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 10;
        }
    }

    public int acessarIndice(int indice) throws IndexOutOfBoundsException {
        return numeros[indice];
    }

    public int getTamanho() {
        return numeros.length;
    }
    public static void main(String[] args) {
        VetorNumeros vetor = new VetorNumeros();

        boolean indiceValido = false;

        while (!indiceValido) {
            String entrada = JOptionPane.showInputDialog(null, "Informe um índice (0 a " + (vetor.getTamanho() - 1) + "):");

            try {
                int indice = Integer.parseInt(entrada);
                int valor = vetor.acessarIndice(indice);
                JOptionPane.showMessageDialog(null, "Valor no índice " + indice + ": " + valor);
                indiceValido = true;
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Índice inválido! Informe um valor entre 0 e " + (vetor.getTamanho() - 1) + ".");
            }
        }
    }
}

