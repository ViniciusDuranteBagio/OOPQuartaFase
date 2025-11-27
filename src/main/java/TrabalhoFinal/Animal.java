import java.util.List;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        setNome(nome);
        setIdade(idade);
        setRaca(raca);
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getRaca() { return raca; }

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || nome.trim().length() < 2 || !nome.matches("[A-Za-zÀ-ÖØ-öø-ÿ ]+")) {
            throw new ValidacaoException("Nome inválido: deve conter somente letras e espaços (mínimo 2 caracteres).");
        }
        this.nome = nome.trim();
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) throw new ValidacaoException("Idade deve ser um inteiro positivo.");
        this.idade = idade;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) throw new ValidacaoException("Raça deve ser informada.");
        this.raca = raca.trim();
    }

    public abstract List<String> getDoencasPossiveis();

    @Override
    public String toString() {
        return String.format("%s (idade: %d, raça: %s)", nome, idade, raca);
    }
}
