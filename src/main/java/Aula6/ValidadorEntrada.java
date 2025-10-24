package Atvd_aula6;

public class ValidadorEntrada {

    public void validarNum(double numero){
        try {
            if (numero < 0) {
                throw new Exception("O número não pode ser negativo");
            }
            System.out.println("Número válido: "+numero);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
