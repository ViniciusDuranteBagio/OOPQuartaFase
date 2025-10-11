package Atividades_Aula_6;

public class ErroComCodigoException extends Exception {
    private int codigo;

    public ErroComCodigoException(String message, int codigo) {
        super(message);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static void main(String[] args) {
        try {
            throw new ErroComCodigoException("Erro personalizado", 1001);
        } catch (ErroComCodigoException e) {
            System.out.println("Erro: " + e.getMessage() + " Código: " + e.getCodigo());
        }
    }
}
