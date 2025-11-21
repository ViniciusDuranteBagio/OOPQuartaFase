public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    public Animal(String nome, int idade, String raca) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÿ ]{2,}")) throw new ValidacaoException("Nome invalido");
        if (idade <= 0) throw new ValidacaoException("Idade invalida");
        if (raca == null || raca.trim().isEmpty()) throw new ValidacaoException("Raca obrigatoria");
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public String getRaca(){return raca;}
    public abstract String[] getDoencas();
}
