package Atividades_Aula_5.src;

public class CPF implements Validador{
    @Override
    public void validar(String valor) {
        if (valor.length() != 14) {
            System.out.println("CPF inválido");
        } else {
            System.out.println("CPF validade com sucesso");
        }
    }
}
