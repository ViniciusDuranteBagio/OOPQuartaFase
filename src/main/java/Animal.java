public abstract class Animal {
    private String nome;
    private String idade;
    private String raca;

    public Animal(String nome, String idade, String raca) throws ValidacaoException {
        if (nome == null || nome.trim().length() < 2) {
            throw new ValidacaoException("Nome deve ter pelo menos 2 caracteres.");
        }
        if (idade == null || idade.trim().isEmpty()) {
            throw new ValidacaoException("Idade inválida.");
        }
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça inválida.");
        }

        this.nome = nome.trim();
        this.idade = idade.trim();
        this.raca = raca.trim();
    }

    public String getNome() { return nome; }
    public String getIdade() { return idade; }
    public String getRaca() { return raca; }

    public abstract String[] getDoencas();
}
