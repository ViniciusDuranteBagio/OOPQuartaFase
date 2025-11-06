package AtividadesAula6;

import javax.swing.*;

public class ValidadorDocumento {
    public static void main(String[] args) throws DocumentoInvalidoException{
        String cpf = JOptionPane.showInputDialog(null, "Informe o número de CPF");

        if (cpf.length() != 11){
            throw new DocumentoInvalidoException("O CPF deve conter 11 caracteres");
        }
    }
}
