
class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("A idade não pode ser negativa.");
        }
        this.idade = idade;
        System.out.println("Idade de " + this.idade + " anos cadastrada com sucesso.");
    }
}
