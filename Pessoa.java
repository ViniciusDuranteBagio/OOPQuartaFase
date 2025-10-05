package Aula6;

public class Pessoa {
    private int idade;

    public Pessoa(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        try {
            Pessoa p = new Pessoa(25);
            System.out.println("Idade: " + p.getIdade());
            Pessoa p2 = new Pessoa(-5);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
