package trabalhofinal;

public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;

    public Animal(String nome, int idade, String raca){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
       return nome;
    }

    // Faz a validação de nome conter apenas letras e max 2 espaços
    public void setNome(String nome) throws ValidacaoException {
        if (!nome.matches("[a-zA-Z]{2,}(?: [a-zA-Z]+){0,2}")) {
            throw new ValidacaoException("Nome inválido! Use apenas letras e espaços.");
        }
        this.nome = nome.trim();
    }

    public String getRaca() {
        return raca;
    }

    // Raça deve ser sempre informada
    public void setRaca(String raca) throws ValidacaoException {
        if (raca == null || raca.trim().isEmpty()){
            throw new ValidacaoException("Raça deve ser informada!");
        }
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    // Idade do animal não pode ser 0 ou negativa e deve ser inteiro
    public void setIdade(int idade) throws ValidacaoException {
        if (idade <= 0){
            throw new ValidacaoException("Idade não pode ser negativa");
        }
        this.idade = idade;
    }

    protected java.util.List<String> criarListaDoenca (String... doenca){
        java.util.List<String> listaDoenca = new java.util.ArrayList<>();
        for(String d: doenca ){
           listaDoenca.add(d);
        }
        return listaDoenca;
    }
    public abstract java.util.List<String> getDoencaComum();


    public String doencasParaTratar(){
        java.util.List<String> doenca = getDoencaComum();
        StringBuilder descricao = new StringBuilder("Escolha a doença do animal:\n");

        for (int i = 0; i < doenca.size(); i++) {
            descricao.append(i + 1)
                    .append(" - ")
                    .append(doenca.get(i))
                    .append("\n");
        }
        String escolha = javax.swing.JOptionPane.showInputDialog(descricao.toString());
        int indice = Integer.parseInt(escolha) - 1;

        return doenca.get(indice);
    }
}
