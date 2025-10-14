package AtividadesAula06;

public class ValidadorEntrada {

    public static double validarNumeroPositivo (double numero) throws EntradaInvalidaException {
        if (numero <=0) {
            throw new EntradaInvalidaException("O numero deve ser positivo");
        }
        return numero;
    }

}
