package polimorfismo.atividades.ativ6;

public class CPF implements IValidador{
    @Override
    public boolean validar(String valor) {
        if (valor == null || valor.length() != 11)
            return false;

        System.out.println("Validando CPF: " + valor);
            return true;
        }
    }

