package Aula6;
/*
 Crie um programa que permita cadastrar uma idade.
 Se o valor for negativo, lance e trate um erro, mostrando que a idade não pode ser negativa.
 Classes a criar:
Pessoa (com atributo idade).
IdadeInvalidaException.
 */
public class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Erro. Idade não pode ser negativa");
        }
        this.idade = idade;

    }
    public int getIdade() {
        return idade;
    }
}
