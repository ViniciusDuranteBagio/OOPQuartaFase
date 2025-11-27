public class Pessoa {
    private int idade;
    public Pessoa(int idade) throws IdadeInvalidaException {
        if (idade < 0) throw new IdadeInvalidaException("Idade não pode ser negativa!");
        this.idade = idade;
    }
}