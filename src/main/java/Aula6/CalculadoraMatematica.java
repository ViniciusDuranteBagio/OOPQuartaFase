package Atvd_aula6;

public class CalculadoraMatematica {
    public double calcularRaiz(double num) throws NumberFormatException{
        if (num <0){
            throw new NumberFormatException("Impossível calcular raiz quadrada de número negativo.");
        }
        double resultadoo = Math.sqrt(num);
        return resultadoo;
    }
}
