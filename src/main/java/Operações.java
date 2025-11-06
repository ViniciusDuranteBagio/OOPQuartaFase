public class Operações {
    public double dividir(String textoNumero1, String textoNumero2)
            throws NumberFormatException, ArithmeticException {

            double num1 = Double.parseDouble(textoNumero1);
            double num2 = Double.parseDouble(textoNumero2);
            if (num2 == 0) {
                throw new ArithmeticException("Não é possível dividir por zero!");
            }
            return num1 / num2;
    }
}
