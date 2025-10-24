package Aula6BrenoLibrelatoManoel;

import javax.swing.JOptionPane;

class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String mensagem, int codigo) {
        super(mensagem);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");

            if (nome == null || nome.trim().isEmpty()) {
                throw new ErroComCodigoException("Nome não pode estar vazio!", 1001);
            }

            if (nome.length() < 3) {
                throw new ErroComCodigoException("Nome deve ter pelo menos 3 caracteres!", 1002);
            }

            JOptionPane.showMessageDialog(null, "Nome válido: " + nome);

        } catch (ErroComCodigoException e) {
            JOptionPane.showMessageDialog(null,
                    "Erro " + e.getCodigo() + ": " + e.getMessage());
        }
    }
}