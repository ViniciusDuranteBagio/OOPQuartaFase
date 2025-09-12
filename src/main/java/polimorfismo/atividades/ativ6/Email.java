package polimorfismo.atividades.ativ6;

public class Email implements IValidador{
    @Override
    public boolean validar(String valor) {
        if (valor == null || !valor.contains("@"))
            return false;
        System.out.println("Validando Email: " + valor);
            return true;
    }
}
