package polimorfismo.atividades.ativ6;

public class CNPJ implements IValidador{
    @Override
    public boolean validar(String valor) {
        if (valor == null || valor.length() != 14)
            return false;
        System.out.println("Validando CNPJ: " + valor);
            return true;
    }
}
