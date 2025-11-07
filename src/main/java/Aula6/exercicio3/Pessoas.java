package Aula6.exercicio3;

public class Pessoas {
    int idade;

    public Pessoas(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa!");
        } else {
            System.out.println("A idade é " + idade);
        }
        this.idade = idade;
    }
}


