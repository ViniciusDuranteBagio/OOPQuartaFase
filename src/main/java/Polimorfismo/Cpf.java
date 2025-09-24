package Polimorfismo;

public class Cpf implements Validador {
    //Fiz uma validação simples sem considerar as letras
    @Override
    public void validar(String valor) {
        if (valor.length() == 11) {
            System.out.println("Cpf valido");
        }else {
            System.out.println("Cpf invalido");
        }
    }
}
