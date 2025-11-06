package AtividadesAula6;

import javax.swing.*;

public class ValidadorEntrada {
    public static void main(String[] args) throws ValorInvalidoException{

        boolean parar = false;

        while (!parar){

            String numeroInformado = JOptionPane.showInputDialog(null, "Informe um numero positivo");

            try {

                if (Integer.parseInt(numeroInformado) < 0){
                    throw new ValorInvalidoException("");
                }
                parar = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: valor não é um número! Tente novamente.");
            } catch (ValorInvalidoException e){
                JOptionPane.showMessageDialog(null, "Erro: número não pode ser negativo! Tente novamente.");
            }
        }
    }
}
