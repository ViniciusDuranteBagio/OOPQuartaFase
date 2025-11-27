package Aula1.Exercicio;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome,int idade,String raca){
        this.idade=idade;
        this.nome=nome;
        this.raca=raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca()throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()){
            throw new ValidacaoException("É necessário ser informado a raça");
        }
        return raca;
    }

    public void setIdade(int idade)throws ValidacaoException {
        if(idade <= 0){
            throw new ValidacaoException ("Idade não pode ser menor ou igual a 0!");

        }else {
            this.idade = idade;
        }
    }

    public void setNome(String nome) throws ValidacaoException{
        if (nome == null || nome.trim().length() < 2) {
            throw new ValidacaoException("O nome deve possuir no mínimo 2 caracteres.");
        }
        this.nome = nome;
    }
    public abstract String[] getDoencasPossiveis();
}
