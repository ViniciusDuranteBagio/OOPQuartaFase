package Trabalho;

public class Animal {
    private String nome;
    private int idade;
    private String raca;

    public void setNome(String nome) throws ValidacaoException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÿ ]{2,}")) {
            throw new ValidacaoException("Nome inválido! Use apenas letras e espaços (mínimo 2 caracteres).");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0) {
            throw new ValidacaoException("Idade inválida! Deve ser um número inteiro positivo.");
        }
        this.idade = idade;
    }

    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new ValidacaoException("Raça deve ser informada!");
        }
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getRaca() {
        return raca;
    }

    public String doencas(){
        String doencas = "Sem animal específico";
        return doencas;
    }

    public String retornaDoenca(int doenca){
        String tipoDoenca = "Sem doença específica";
        return tipoDoenca;
    }

    @Override
    public String toString() {
        return getNome() + " - Raça: " + getRaca() + " - Idade: " + getIdade() + " anos";
    }
}