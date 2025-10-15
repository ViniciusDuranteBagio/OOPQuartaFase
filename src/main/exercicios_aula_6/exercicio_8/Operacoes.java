package exercicio_8;

class Operacoes {

    public double converterParaNumero(String texto) throws NumberFormatException {
        return Double.parseDouble(texto);
    }

    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero");
        }
        return a / b;
    }
}