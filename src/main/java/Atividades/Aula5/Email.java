package Atividades.Aula5;

public class Email implements  Validadores {
    @Override
    public boolean validar(String email) {
        String regex = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }
}
