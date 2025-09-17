package Atividades_Aula_5.src;

public class CNPJ implements Validador{
    @Override
    public void validar(String valor) {
        if (valor.length() != 18) {
            System.out.println("CNPJ inválido");
        } else {
            System.out.println("CNPJ validade com sucesso");
        }
    }
}
