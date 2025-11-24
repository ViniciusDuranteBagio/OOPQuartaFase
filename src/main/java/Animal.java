public class Animal {

    private String nome;
    private int idade;
    private String raca;

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÿ ]{2,}")) {
            throw new ValidacaoException("Nome inválido! Use apenas letras, mínimo 2 caracteres.");
        }
        this.nome = nome;
    }
    public String getNome() { return nome; }

    public void setIdade(double idade) throws ValidacaoException {
        if (idade <= 0) throw new ValidacaoException("Idade deve ser maior que zero!");
        this.idade = (int) idade;
    }
    public double getIdade() { return idade; }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) throw new ValidacaoException("Raça obrigatória!");
        this.raca = raca;
    }
    public String getRaca() { return raca; }

    public String[] getDoencas() {
        return new String[0];
    }
}