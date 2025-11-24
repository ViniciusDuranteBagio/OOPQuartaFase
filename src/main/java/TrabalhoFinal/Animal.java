package TrabalhoFinal;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
     if (nome == null || nome.trim().length() < 2) {
         throw new ValidacaoException("O nome do animal deve conter pelo menos 2 caracteres");

     }
        if (idade < 0) {
            throw new ValidacaoException("Idade não pode ser negativa.");

     }
     if (raca == null || raca.trim().isEmpty()) {
         throw new ValidacaoException("Deve conter raça");
     }

     this.nome = nome.trim();
     this.idade = idade;
     this.raca = raca.trim();
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;

    }
    public abstract String[] getDoencas();

    @Override
    public String toString() {
        return nome + " (" + this.getClass().getSimpleName() + ") - " + idade + " anos, raça: " + raca;
    }
}