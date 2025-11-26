import java.util.regex.Pattern;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;


    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    private void validarNome(String nome) throws ValidacaoException {
        if (nome == null || nome.length() < 2 || !Pattern.matches("^[a-zA-Z\\s]{2,}$", nome)) {
            throw new ValidacaoException("Nome inválido. Deve ter no mínimo 2 caracteres, apenas letras e espaços.");
        }
    }

    private void validarIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade deve ser um número inteiro positivo.");
        }
    }

    private void validarRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada.");
        }
    }


    public String getNome() {
        return nome; }

    public int getIdade() {
        return idade; }

    public String getRaca() {
        return raca; }

    public abstract boolean podeTerDoenca(String doenca);
    public abstract String[] getDoencasPossiveis();

    @Override
    public String toString() {
        return "Tipo: " + this.getClass().getSimpleName() + ", Nome: " + nome + ", Idade: " + idade + " anos, Raça: " + raca;
    }
}