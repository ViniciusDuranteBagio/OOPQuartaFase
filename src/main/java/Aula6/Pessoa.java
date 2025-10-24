package Atvd_aula6;

public class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException{
        if (idade <0){
            throw new IdadeInvalidaException("Não pode ser negativo.");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
