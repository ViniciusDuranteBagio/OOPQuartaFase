
import javax.swing.JOptionPane;

public class Conversor {

    public int converter(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Conversor conv = new Conversor();
        while (true) {
            String input = JOptionPane.showInputDialog("Digite um número:");
            if (input == null) break; // cancel
            try {
                int num = conv.converter(input);
                System.out.println("Número: " + num);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente.");
            }
        }
    }
}
