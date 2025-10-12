package Aula06;

public class Pessoa {
    private int idade;

    public Pessoa() {}

    public Pessoa(int idade) throws IdadeInvalidaException {
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException{
        if(idade < 0){
            throw new IdadeInvalidaException("Idade nao pode ser negativa");
        }
        this.idade = idade;
    }
}
