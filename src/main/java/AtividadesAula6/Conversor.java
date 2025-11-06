package AtividadesAula6;

import javax.swing.*;

public class Conversor {
    public static void main(String[] args) {

        boolean parar = false;

        while (!parar){
            try {
                int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um valor"));
                JOptionPane.showMessageDialog(null, "Resultado: " + valor);
                parar = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: valor não é um número! Tente novamente.");
            }
        }
    }
}
