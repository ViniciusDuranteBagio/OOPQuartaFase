package AtividadesAula06;

public class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidadaException {
        if (idade < 0) {
            throw new IdadeInvalidadaException("Erro. Idade não pode ser negativa");
        }
        this.idade = idade;

        }
        public int getIdade() {
        return idade;
    }
}
