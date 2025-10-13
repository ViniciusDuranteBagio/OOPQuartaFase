package Atividades.Aula6;

public class Operacoes {

    public double converterParaNumero(String texto){
        return Double.parseDouble(texto);
    }

    public double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}
