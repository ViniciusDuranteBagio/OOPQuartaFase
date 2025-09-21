package Atividades.Aula5;

public class CNPJ implements Validadores{
    @Override
    public boolean validar(String cnpj) {
        if (cnpj == null || cnpj.length() != 14) {
            return false;
        }
        return true;
    }
}
