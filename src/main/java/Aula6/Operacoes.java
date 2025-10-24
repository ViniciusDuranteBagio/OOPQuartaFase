package Atvd_aula6;

public class Operacoes {
    public double converteDivide(String texto, double divisor) throws Exception{
        double numero = 0;

        try {
            numero = Double.parseDouble(texto);
        }catch (NumberFormatException e){
            throw new Exception("erro: o texto não é um número.");
        }

        if (divisor == 0) {
            throw new Exception("erro: não é possível dividir por 0");
        }
        return numero / divisor;
    }
}
