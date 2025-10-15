package Aula6atv;

public class Pessoa {
    private int idade;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {

            if (idade < 0) {
                // lança a exceção personalizada
                throw new IdadeInvalidaException("Erro: A idade não pode ser negativa!");
            }
        this.idade = idade;
    }


}
