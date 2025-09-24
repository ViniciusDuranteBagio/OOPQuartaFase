package Polimorfismo;

public class Cnpj implements Validador {
    //Fiz uma validação simples sem considerar as letras
    @Override
    public void validar(String valor) {
        if(valor.length() == 14) {
            System.out.println("CNPJ VALIDO");
        }else {
            System.out.println("CNPJ INVALIDO");
        }
    }
}
