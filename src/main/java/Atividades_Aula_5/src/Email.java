package Atividades_Aula_5.src;

public class Email implements Validador{
    @Override
    public void validar(String valor) {
        if (valor.contains("@") && valor.contains("gmail.com")) {
            System.out.println("Email validado com sucesso");
        } else {
            System.out.println("Email inválido");
        }
    }
}