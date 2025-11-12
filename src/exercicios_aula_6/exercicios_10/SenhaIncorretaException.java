package exercicios_aula_6.exercicios_10;

class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String mensagem) {
        super(mensagem);
    }
}