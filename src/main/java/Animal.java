public class Animal {
    private String nome;
    private int idade;
    private String raca;

    public void setNome(String nome) throws FalhaException {
        if (nome == null || !nome.matches("[A-Za-zÀ-ÿ ]{2,}")) {
            throw new FalhaException("Nome inválido! Use apenas letras e espaços (mínimo 2 caracteres).");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) throws FalhaException {
        if (idade <= 0) {
            throw new FalhaException("Idade inválida! Insira um número inteiro positivo.");
        }
        this.idade = idade;
    }

    public void setRaca(String raca) throws FalhaException {
        if (raca == null || raca.trim().isEmpty()) {
            throw new FalhaException("Informe a raça.");
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
        String doencas = "Especifique um animal.";
        return doencas;
    }

    public String returnDoenca(int doenca){
        String tipoDoenca = "Sem doença específica";
        return tipoDoenca;
    }

    @Override
    public String toString() {
        return getNome() + " - Raça: " + getRaca() + " - Idade: " + getIdade() + " anos";
    }
}
