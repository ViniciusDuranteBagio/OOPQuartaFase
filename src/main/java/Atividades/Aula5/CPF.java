package Atividades.Aula5;

public class CPF implements Validadores{
    @Override
    public boolean validar(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        return true;
    }
}
