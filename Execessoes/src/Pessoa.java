public class Pessoa {
    public class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem);
        }
    }
    private int idade;

    public Pessoa() {}
    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("A idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}