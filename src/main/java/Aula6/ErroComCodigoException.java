package Aula6;

import javax.swing.*;

public class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String mensagem, int codigo) {
        super(mensagem);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static void testar() {
        try {
            throw new ErroComCodigoException("Erro detectado!", 101);
        } catch (ErroComCodigoException e) {
            JOptionPane.showMessageDialog(null, "Mensagem: " + e.getMessage() + "\nCódigo: " + e.getCodigo());
        }
    }
}